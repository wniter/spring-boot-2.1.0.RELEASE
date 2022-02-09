package com.example.demo.sample.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @create 2022-02-09 11:21
 */
@Component
public class Person {
	@Value("${person.lastname}")
	private String lastname;
	@Value("#{1+2}")
	private Integer age;

	private String sex;

	private List<String> list;

	public Person() {
	}

	public Person(String lastname) {
		this.lastname = lastname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person{" +
				"lastname='" + lastname + '\'' +
				", age=" + age +
				", sex='" + sex + '\'' +
				", list=" + list +
				'}';
	}
}
