package com.cuijie.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.cuijie.entity.Person;
import com.cuijie.utils.PersonUtils;
import com.cuijie.utils.RandomUtils;
import com.cuijie.utils.StringUtils;

class PersonUtilsTest {

	@Test
	void test() {
		Calendar c = Calendar.getInstance();
		c.set(2001,0,1);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<10000;i++) {
			Date randomDate = PersonUtils.randomDate(c.getTime());
			Person person = new Person(StringUtils.generateChineseName(), RandomUtils.random(1, 120), StringUtils.randomChineseString(140),simpleDateFormat.format(randomDate) );
			
			System.out.println(person);
			
			
			
			
		}
		
		
	}

}
