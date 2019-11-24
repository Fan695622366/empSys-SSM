package com.zyz.ssm.util;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 使用md5不可逆加密算法对用户输入的密码进行加密, 确保隐私数据的安全性
 */
public class MD5Utils {

	/**
	 * 使用该方法将明文加密成密文<br>
	 * 
	 * @param plaintext 明文, 即用户能够看得懂的字符串信息
	 * @return 返回出密文
	 * @throws NoSuchAlgorithmException
	 */
	public static String md5(String plaintext) {

		// 加密后的文摘
		byte[] digest = null;

		try {
			// 获取到加密对象
			MessageDigest instance = MessageDigest.getInstance("md5");
			// 通过disget方法将字符串的字节数组进行加密
			digest = instance.digest(plaintext.getBytes());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		// 把加密后的文摘转变为一个长度为32位的字符串
		// 首先转变为字符串[16进制形式的字符串]
		String ciphertext = new BigInteger(1, digest).toString(16);
		// 然后补足32为[在上面补"0"]
		for (int i = 0; i < 32 - ciphertext.length(); i++) {
			ciphertext += 0;
		}
		return ciphertext;
	}

}

