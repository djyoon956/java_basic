/*
Today Point : [상속 관계]에서 override : 상속 관계에서 메서드 재정의
- 상속 관계에서 자식 클래스가 부모 클래스의 메서드를 재정의
재정의의 의미 : 틀의 변화(함수의 이름, Return Type)의 변화가 아니라 {내용}의 변화를 말하낟.
문법)
1. 부모 함수 이름 동일
2. 부모 함수 parameter 동일
3. 부모 함수 return type 동일
>> { 안의 내용만 수정 가능하다. }
*/
class Point2 {
	int x = 4;
	int y = 5;

	String getPosition() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point2 {
	int z = 6;

	@Override
	String getPosition() {
		return super.getPosition() + ", z : " + z;
	}
}

public class Ex04_inherit_override {
	public static void main(String[] args) {
		Point3D point3d = new Point3D();
		System.out.println(point3d.getPosition());
		;
	}
}
