package kr.or.bit;
/*
Tv 설계도
요구사항 정의
Tv는 채널 정보를 가지고 있다 (ex)1~200)
Tv는 브랜드 이름을 가지고 있다. (ex)삼성 엘지)
Tv는 채널 전환 기능을 가지고 있다. (채널은 한 채널씩 이동가능하다)
->채널을 증가시키는 기능을 가지고있다.
->채널을 감소시키는 기능을 가지고있다.
*/

public class Tv {
	public String brand;
	public int channel = 1;

	public void DownChannel() {
			channel--;
	}

	public void UpChannel() {
			channel++;
	}
}
