import java.util.Properties;

/*
Map 인터페이스를 구현한 클래스
특수한 목적의 클래스<String, String> key Type, value Type 고정시킨 클래스

사용목적
App 공통 속성 정의 (환경 변수) : 프로그램 버전, 파일 경로, 공통 변수
ex)
datasample.properties

*/

public class Ex15_Properties {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("master", "bit@bit.co.kr");
		properties.setProperty("version", "1.1.1.1");
		properties.setProperty("defaultpath", "c:\\temp\\images");

		// 각각의 개발 페이지에서
		System.out.println(properties.get("defaultpath"));
	}
}
