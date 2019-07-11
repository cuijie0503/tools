package com.cuijie.test;





import org.junit.jupiter.api.Test;

import com.cuijie.utils.StringUtils;

class StringUtilsTest {

	@Test
	void test() {
	
		System.out.println(StringUtils.hasLength("123"));
	}
	@Test
	void test2() {
	
		System.out.println(StringUtils.hasText("123"));
	}

	@Test
	void test3() {
	
		String randomChineseString = StringUtils.randomChineseString();
		System.out.println(randomChineseString);
	}
	@Test
	void test4() {
	
		 String randomChineseString = StringUtils.randomChineseString(3);
		 System.out.println(randomChineseString);
		
	}
	@Test
	void test5() {
	String generateChineseName = StringUtils.generateChineseName();
	System.out.println(generateChineseName);
		
		
	}
}
