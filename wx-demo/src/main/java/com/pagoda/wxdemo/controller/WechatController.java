package com.pagoda.wxdemo.controller;

import com.pagoda.wxdemo.bean.InputMessage;
import com.pagoda.wxdemo.bean.OutputMessage;
import com.thoughtworks.xstream.XStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@RestController
@RequestMapping("/Wechat")
public class WechatController {

	Logger log = LoggerFactory.getLogger(WechatController.class);


	@GetMapping("/sendMsg")
	public String sendMsg(HttpServletRequest request, HttpServletResponse response){


		return null;
	}


	@RequestMapping(value = "/wxServlet", method = RequestMethod.GET)
	@ResponseBody
	public String wechatIncome(HttpServletRequest request, HttpServletResponse response) {

		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		System.out.println("echostr" +echostr);
		log.debug("参数:signature={},timestamp={},nonce={},echostr={}", signature, timestamp, nonce, echostr);

		boolean isPass = WechatUtils.checkSignature(signature, timestamp, nonce);

		if (isPass) {
			return echostr;
		} else {
			return "error";
		}

	}

	@RequestMapping(value = "income", method = RequestMethod.POST)
	public void processMessage(HttpServletRequest request, HttpServletResponse response) {

		StringBuilder xmlMsg = new StringBuilder();
		String line;

		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null) {
				xmlMsg.append(line);
			}
			log.info("消息体：" + xmlMsg.toString());
			reader.close();
			// 将POST流转换为XStream对象
			XStream xs = SerializeXmlUtil.createXstream();
			xs.processAnnotations(InputMessage.class);
			xs.processAnnotations(OutputMessage.class);
            // 将指定节点下的xml节点数据映射为对象
            xs.alias("xml", InputMessage.class);
            
            //将xml内容转换为InputMessage对象
            InputMessage inputMsg = (InputMessage) xs.fromXML(xmlMsg.toString());
			System.out.println(inputMsg);
            
//			XStream xs = Serializex
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("post");

	}

	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}

}
