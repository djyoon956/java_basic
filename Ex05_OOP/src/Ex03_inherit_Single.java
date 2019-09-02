// 두 개의 설계도
class Tv {
	boolean power;
	int ch;

	void Power() {
		this.power = !this.power;
	}

	void chUp() {
		ch++;
	}

	void chDown() {
		ch--;
	}
}

class Vcr {
	boolean power;

	void Power() {
		this.power = !this.power;
	}

	void play() {
		System.out.println("play!");
	}

	void stop() {
		System.out.println("stop!");
	}

	void rew() {

	}

	void ff() {

	}
}

// Tv 설계도, Vcr 설계도를 활용해서 
// TvVcr이라는 설계도를 만드세요.
// 재사용
class TvVcr extends Tv {
	Vcr vcr;

	TvVcr() {
		vcr = new Vcr();
	}
}

public class Ex03_inherit_Single {
	public static void main(String[] args) {
		TvVcr tvVcr = new TvVcr();
		tvVcr.Power();
		System.out.println("Tv 전원 상태 : " + tvVcr.power);
		tvVcr.chUp();
		System.out.println("Tv 채널 정보 : " + tvVcr.ch);

		tvVcr.vcr.Power();
		System.out.println("vcr 전원 상태 : " + tvVcr.vcr.power);
		tvVcr.vcr.play();
		tvVcr.vcr.stop();
		tvVcr.vcr.Power();
		tvVcr.Power();
		System.out.println("Tv 전원 상태 : " + tvVcr.power);
		System.out.println("vcr 전원 상태 : " + tvVcr.vcr.power);
	}
}
