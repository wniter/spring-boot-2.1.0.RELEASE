package com.example.demo.sample;


import com.example.demo.sample.entity.Person;
import org.junit.Test;

/**
 * @create 2022-02-09 11:27
 */
public class TestDemo {


	@Test
	public  void Test01() {
		Person person = new Person();
		System.out.println(person.getLastname());
	}
}
