package com.cuijie.test;





import org.junit.jupiter.api.Test;

import com.cuijie.utils.RandomUtils;

class RandomUtilsTest {

	@Test
	void test() {	
		int random = RandomUtils.random(1, 10);
		System.out.println(random);
	}

	@Test
	void test2() {	
		int[] subRandom = RandomUtils.subRandom(1, 10, 3);
		
		for (int i : subRandom) {
			System.out.println(i);
		}
		
	}
	
	@Test
	void test3() {	
		 char character = RandomUtils.randomCharacter();
		 System.out.println(character);
		
	}
	

	@Test
	void test4() {	
		  String randomString = RandomUtils.randomString(4);
		 System.out.println(randomString);
		
	}
	
	
}
