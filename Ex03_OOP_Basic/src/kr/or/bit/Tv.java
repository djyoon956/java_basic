package kr.or.bit;
/*
Tv ���赵
�䱸���� ����
Tv�� ä�� ������ ������ �ִ� (ex)1~200)
Tv�� �귣�� �̸��� ������ �ִ�. (ex)�Ｚ ����)
Tv�� ä�� ��ȯ ����� ������ �ִ�. (ä���� �� ä�ξ� �̵������ϴ�)
->ä���� ������Ű�� ����� �������ִ�.
->ä���� ���ҽ�Ű�� ����� �������ִ�.
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
