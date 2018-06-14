package com.pagoda.wxdemo.controller;

import java.util.Arrays;

public class WechatUtils {

	/**
	 * 校验签名
	 * 
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @return
	 */
	public static boolean checkSignature(String signature, String timestamp, String nonce) {
		String[] arr = { "litang", timestamp, nonce };
		Arrays.sort(arr);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}

		String pwd = SHA1.Encrypt(sb.toString());
		System.out.println(pwd);
		System.out.println(signature);
		if (pwd.equals(signature)) {
			return true;
		} else {
			return false;
		}
	}
}
