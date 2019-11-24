package com.zyz.ssm.util;

import java.util.UUID;

/**
 * 这是UUID生成的工具类
 */
public class UUIDUtils {

	private UUIDUtils() {

	}

	/**
	 * 生成64位UUID的方法<br>
	 * 主要用于生成用户的帐号和激活码<br>
	 * @return
	 */
	public static String getNewUUID() {
		
		String str1 = UUID.randomUUID().toString();
		String str2 = UUID.randomUUID().toString();
		str2 += str1;

		str2 = str2.replace("-", "");
		
		return str2;
	}

}
