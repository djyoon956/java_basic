import javafx.scene.shape.VLineTo;

/*
한 개 이상의 설계도를 생상하는 기준
-상속 관계 (is ~ a ) : ~은 ~이다 (부모를 뒤에)
	ex) 박쥐는 동물이다.
-포함 관계 (has ~ a) : ~은 ~을 가지고 있다.
	ex) 경찰은 권총을 가지고있다.
	
원 클래스, 도형 클래스
>> 원 extends 도형

원 클래스, 점 클래스
>>  원은 점이다 x
>> 원은 점을 가지고 있다.
>> class 원 {점 변수;}

경찰,총
>> 경찰은 총이다 x
>> 경찰은 총을 가지고 있다. o
>> class 경찰 {총 변수 ; }
---------------------------
ex)
원, 삼각형, 사각형을 만드는 설계도 작성

원은 도형이다.
삼각형은 도형이다
사각형은 도형이다.

도형 : 추상화, 일반화 (색상, 그리다) >> 공통 자원
원 : 구체화, 특수화 -> 반지름, 점 >> 본인만 가지고 잇는 것

점 : 좌표값(x,y)
원은 점을 가지고 있다.
삼각형은 점을 가지고 있다.
사각형은 점을 가지고 있다.

일반화(공통, 추상) : shape(그리다, 색상), point(점)
class Shape{ } //상속
class Point{ } // 포함

구체화 특수화 : circle, triangle,

*/

// 추상화(공통 기능)
class Shape {
	String color = "gold"; // 공통 속성

	void draw() { // 공통 기능
		System.out.println("draw");
	}
}

//추상화(공통 기능)
class Point {
	int x;
	int y;

	public Point() {
		// this.x = 1;
		// this.y = 1;
		this(1, 1);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

// Q. 원을 만드세요
// 정의 : 한 점과 반지름을 가지고있다.
// 원은 도형이다.
// 원은 점을 가지고 있다.
// 원의 특수성은 반지름 : r
// 원의 반지름은 default으로 10을 가진다.
// x,y 좌표는 default로 (10,15)를 가진다. 
// default 설정을 원하지 않으면 반지름과 점의 값을 입력할 수 있다. (원이 만들어 질때)

class Circle extends Shape {
	int r; // 반지름
	Point center;

	public Circle() {
		this(10, new Point(10, 15));
	}

	public Circle(int r, Point center) {
		this.r = r;
		this.center = center;
	}
}

// 문제 1)
// 삼각형 클래스를 만드세요.
// 정의 : 삼각형은 3개의 점과 색과 그리고 그리다라는 기능을 가진다.
// Shape, point 제공 받아요
// hint) (x,y) (x,y) (x,y)
// default로 그릴 수 있고, 3개의 좌표값을 받아서 그릴 수 있다.
class Triangle extends Shape {
	Point point1;
	Point point2;
	Point point3;

	Triangle() {

		this(new Point(), new Point(), new Point());
	}

	Triangle(Point point1, Point point2, Point point3) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	// +추가 기능
	void trianglePoint() {
		System.out.printf("(%d , %d)/(%d , %d)/(%d , %d)\n", point1.x, point1.y, point2.x, point2.y, point3.x,
				point3.y);
	}
}

// 배열로 변경
class Triangle2 extends Shape {
	Point[] points;

	Triangle2() {
		this(new Point[] { new Point(), new Point(), new Point() });
	}

	Triangle2(Point[] points) {
		this.points = points;
	}

	void trianglePoint() {
		for (Point value : points)
			System.out.printf("(%d , %d)\n", value.x, value.y);
	}
}

public class Ex02_inherit_composition {
	public static void main(String[] args) {
//		Circle c1 = new Circle();
//		c1.r = 5;
//		c1.center = new Point();
//		c1.draw();

		Circle c = new Circle();
		c.draw();
		System.out.println("c.color : " + c.color);
		System.out.println("c.r : " + c.r);
		System.out.println("c.center.x : " + c.center.x);
		System.out.println("c.center.y : " + c.center.y);

		Triangle t1 = new Triangle();
		t1.trianglePoint();
		System.out.println("색상 : " + t1.color);
		t1.draw();

		Triangle2 t2 = new Triangle2();
		t2.trianglePoint();
		System.out.println("색상 : " + t2.color);
		t2.draw();

		Triangle2 t3 = new Triangle2(new Point[] { new Point(10, 10), new Point(20, 20), new Point(30, 30) });
		t3.trianglePoint();
		System.out.println("색상 : " + t3.color);
		t3.draw();
	}
}
