import kr.or.bit.Airplane;
import kr.or.bit.Card;

public class Ex05_Static_CardMake {
	public static void main(String[] args) {

		/* �ʱ� �䱸����
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.cardInfor();

		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfor();
		*/
		
		// ...53�� ����...
		
		// �� : ī�� ũ�� ���� ��û
		Card.h=70;
		Card.w=50;
		Card c = new Card();
//		c.h = 70;
//		c.w = 50;
		c.number = 1;
		c.kind = "heart";
		c.cardInfor();

		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfor();
		
		// ����� 53���� ������ �Ͻðڽ��ϱ�?

		
	}
}
