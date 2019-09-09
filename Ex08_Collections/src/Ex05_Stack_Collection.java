import java.util.Stack;

import kr.or.bit.Coin;
import kr.or.bit.Mystack;



public class Ex05_Stack_Collection {
	public static void main(String[] args) {

		// Stack 클래스 제공 (LIFO)
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty()); // true
		// System.out.println(stack.pop()); //java.util.EmptyStackException

		// stack 직접 코드 작성
		Mystack my = new Mystack(3);
		System.out.println(my.full());
		my.push(10);
		my.push(20);
		my.push(30);
		my.push(40);
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());

		Stack<Coin> coinbox = new Stack<Coin>();

		// 동전박스에 동전을 넣는다
		// 100, 50, 500, 10
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(10));

		while (coinbox.isEmpty()) {//
			Coin coin = coinbox.pop();
			System.out.println("꺼낸 동전: " + coin.getValue() + "원");

		}

	}

}
