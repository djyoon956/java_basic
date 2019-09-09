package kr.or.bit;

//내가 직접 만드는 자료구조(stack)
//데이터 저장소 (여러개의 값을) >> Array 
//저장소의 위치 (index) 관리
//LIFO (후입선출) : 기능 
//push , pop , empty , full 함수 구현
public class Mystack {
	private Object[] stackarr; // 데이터 저장소 (여러개의 값을)
	private int maxsize; // 최대크기
	private int top; // 이동정보(index) posittion

	public Mystack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1;
	}

	public boolean empty() { // true 스텍 비어 있니
		return (top == -1);
	}

	public boolean full() {
		return (top == maxsize - 1); // 배열값 [0]
	}

	public void push(Object i) {
		if (full()) {
			System.out.println("stack full");
		} else {
			stackarr[++top] = i; // 처음 top=-1 >> [0]
		}
	}

	public Object pop() {
		Object value = null;
		if (empty()) {
			System.out.println("stack empty");
		} else {
			value = stackarr[top];
			top--;
		}
		return value;
	}
}
