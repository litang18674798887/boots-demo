package com.pagoda.wxdemo.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 小程序模板消息
 * @author gzw
 *
 */
public class XcxTemplateMsg {
	/**
	 * 用户的openid
	 */
	private String toUser;

	/**
	 * 所需下发的模板消息Id
	 */
	private String templateId;

	/**
	 * 点击模板跳转的小程序页面
	 */
	private String page;

	/**
	 * 支付场景下，为本次支付的 prepay_id
	 */
	private String formId;

	/**
	 * 模板内容，不填则为空
	 */
	private List<TemplateParam> templateParamList;

	/**
	 * 模板内容字体颜色，不填默认黑色
	 */
	private String color;

	/**
	 * 模板要放大的关键词
	 */
	private String emphasisKeyword;
	
	public String getToUser() {
		return toUser;
	}
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public List<TemplateParam> getTemplateParamList() {
		return templateParamList;
	}
	public void setTemplateParamList(List<TemplateParam> templateParamList) {
		this.templateParamList = templateParamList;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEmphasisKeyword() {
		return emphasisKeyword;
	}
	public void setEmphasisKeyword(String emphasisKeyword) {
		this.emphasisKeyword = emphasisKeyword;
	}
	
	/**
	 * 将对象转为发送模板消息所需的json串
	 * @return
	 */
	public String toJSON() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("{");
		buffer.append(String.format("\"touser\":\"%s\"", this.toUser)).append(",");
		buffer.append(String.format("\"template_id\":\"%s\"", this.templateId)).append(",");
		buffer.append(String.format("\"page\":\"%s\"", this.page)).append(",");
		buffer.append(String.format("\"form_id\":\"%s\"", this.formId)).append(",");
		buffer.append("\"data\":{");
		TemplateParam param = null;
		for (int i = 0; i < this.templateParamList.size();i++) {
			param = templateParamList.get(i);
			// 判断是否追加逗号
			if(i< this.templateParamList.size() - 1) {
				buffer.append(String.format("\"%s\":{\"value\":\"%s\",\"color\":\"%s\"},", param.getName(), param.getValue(), param.getColor()));
			} else {
				buffer.append(String.format("\"%s\":{\"value\":\"%s\",\"color\":\"%s\"}", param.getName(), param.getValue(), param.getColor()));
			}
		}
		buffer.append("},"); 
		buffer.append(String.format("\"color\":\"%s\"", this.color)).append(",");
		buffer.append(String.format("\"emphasis_keyword\":\"%s\"", this.emphasisKeyword));
		buffer.append("}"); 
		return buffer.toString();
		
	}
	
/*    public String toJSON() {  
        StringBuffer buffer = new StringBuffer();  
        buffer.append("{");  
        buffer.append(String.format("\"touser\":\"%s\"", this.toUser)).append(",");  
        buffer.append(String.format("\"template_id\":\"%s\"", this.templateId)).append(",");  
        buffer.append(String.format("\"url\":\"%s\"", this.url)).append(",");  
        buffer.append(String.format("\"topcolor\":\"%s\"", this.topColor)).append(",");  
        buffer.append("\"data\":{");  
        TemplateParam param = null;  
        for (int i = 0; i < this.templateParamList.size(); i++) {  
             param = templateParamList.get(i);  
            // 判断是否追加逗号  
            if (i < this.templateParamList.size() - 1){  
                  
                buffer.append(String.format("\"%s\": {\"value\":\"%s\",\"color\":\"%s\"},", param.getName(), param.getValue(), param.getColor()));  
            }else{  
                buffer.append(String.format("\"%s\": {\"value\":\"%s\",\"color\":\"%s\"}", param.getName(), param.getValue(), param.getColor()));  
            }  
          
        }  
        buffer.append("}");  
        buffer.append("}");  
        return buffer.toString();  
        } */
	
	public static void main(String[] args) {
		XcxTemplateMsg tm = new XcxTemplateMsg();
		tm.setToUser("123456789");
		tm.setTemplateId("abcdefghijk");
		tm.setFormId("aaa");
		List<TemplateParam> paras=new ArrayList<TemplateParam>(); 
		paras.add(new TemplateParam("keyword1", "苹果", ""));
		paras.add(new TemplateParam("keyword2", "2人团", ""));
		paras.add(new TemplateParam("keyword3", "2017-11-27 19:25:33", ""));
		tm.setTemplateParamList(paras);
		tm.setColor("");
		tm.setEmphasisKeyword("keyword1.DATA");
		System.out.println(tm.toJSON());
		
	}
	@Override
	public String toString() {
		return "XcxTemplateMsg [toUser=" + toUser + ", templateId=" + templateId + ", page=" + page + ", formId="
				+ formId + ", templateParamList=" + templateParamList + ", color=" + color + ", emphasisKeyword="
				+ emphasisKeyword + "]";
	}
	
	
	
}
