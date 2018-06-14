package com.pagoda.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author : litang
 * @date : Create in 2018/6/14
 */
public class JiaMi {

    private static final String PLATFORM_KEY = "pagodabaiguoyuan";


    /**
     * 将token利用平台密钥解密，得到用户密钥
     * @param decrypted
     * @return
     * @throws Exception
     */
    private String generateBusinessKey(String decrypted) throws Exception {
        String token = "AC266564DC422E139886D9155800F61E694A333FB9A3BDDF90230F9C46D87D6A";
        String mBusinessEncryptionKey = "";
        // 解密后内容为如下结构 "9|9151dd8a7fd7|NaN" ，需要拆分取得真正的用户密钥
        String businessKeyContent = AESUtils.decrypt(PLATFORM_KEY, token);
        if (businessKeyContent.matches(".+?|.+?|.+?")) {
            mBusinessEncryptionKey = businessKeyContent.split("\\|")[1];
        }
        return mBusinessEncryptionKey;
    }




    public static void main(String[] args) throws Exception {
        //获取用户密钥
        String data = "E667A427BF35DDB09944FE0F27EDE5163AC275AF9AE5430ECFE02ECFD08AC97E3E055717376A57621E85E71055C1ED12113EAB8C5E7E078B09CA6F9776F8D95612B2D7CEB6FBFAB8D25BB7C617B2ACF1A3A96E80261985AD09A298A13AE4EA961E4C3C863965A9AB163A844E86D162A0A973C400B8A6F7DCCB71F7B58183EB593B44E36DC06A1703C69CD83292B8E4A96430889D558C0D17BD2F2BEE02AD55A9AB23E986F32CF49EBD4140BC82472F8E95F8D83E2B8AD015AD6D4F22C9F4EC917FC3E7D6C957F3C55A2DADB2BC340AC390FFA6FA224B2B748DE3D0EB746A9108563AE659ECB796EA6ED3CD78CBFD16B14671700FBDF3ED22CFE9D51A9A00E90C6267B467D141B8DCB89C04DA5C5EFF4329CEAD19C40C29443F7385832896145C1152CC080CA2325CEB48F242C690E0571CF7E57C88E0B4498C7E5FEC4222CCD8D633D46A45338B41236BA2DD09A59C36334D6A0471AB2ACEEAD8F3E41DCC8EF55213E8E016680F0D7C4E2A4EC0F77B32AB42E1A208709986745896897C8F68D2";
        String token = "AC266564DC422E139886D9155800F61E694A333FB9A3BDDF90230F9C46D87D6A";
        String pagodabaiguoyuan = AESUtils.decrypt("pagodabaiguoyuan", token);
        System.out.println(pagodabaiguoyuan);
        //用户密钥
        String substring = pagodabaiguoyuan.substring(10, 26);
        System.out.println(substring);

        //解密
        String decrypt = AESUtils.decrypt(substring, data);
        System.out.println(decrypt);

        JSONObject jsonObject = JSONObject.parseObject(decrypt);
        String result = JSON.toJSONString(jsonObject);
        System.out.println(result);

        //加密
        String encrypt = AESUtils.encrypt(substring, result);
        System.out.println(encrypt);
        System.out.println(encrypt.equals(data));

        //解密
        String decrypt1 = AESUtils.decrypt(substring, encrypt);
        System.out.println(decrypt1);


    }




}
