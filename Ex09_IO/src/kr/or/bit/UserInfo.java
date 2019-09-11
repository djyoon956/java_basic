package kr.or.bit;
/*
객체 통신
객체를 네트워크, 파일간에, 프로세스 간에 통신

- 직렬화 : 객체를 분해해서 줄을 세워보내는 과정
	* 조건 : implements Serializable
- 역 직렬화 : 객체를 다시 조립하는 과정

실습
대상 : 파일
1. 객체 write (직렬화)
2. 객체 read (역 직렬화)

*/

import java.io.Serializable;

public class UserInfo implements Serializable {
	private String name;
	private String pwd;
	private int age;

	public UserInfo() {
	}

	public UserInfo(String name, String pwd, int age) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
}
