import kr.or.bit.Airplane;
import kr.or.bit.Card;

public class Ex05_Static_CardMake {
	public static void main(String[] args) {

		/* 초기 요구사항
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.cardInfor();

		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfor();
		*/
		
		// ...53장 생성...
		
		// 고객 : 카드 크기 변경 요청
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
		
		// 당신은 53번의 수정을 하시겠습니까?

		
	}
}
