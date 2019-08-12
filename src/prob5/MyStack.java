package prob5;

import java.util.Arrays;

public class MyStack {
	private int top = -1;
	private String[] buffer;

	//생성자
	public MyStack(int size) {
		buffer = new String[size];
	}

	//값을 넣는다
	public void push(String data) {
		if(isFull()) {
			resize();	
		}
		top++;
		buffer[top] = data;		
	}

	//스택이 비었는지 확인
	public boolean isEmpty() {
		return (top==-1);
	}
	
	//스택이 꽉 차있는지 확인
	public boolean isFull() {
		return (top==buffer.length-1);
	}

	//값을 뺀다
	public String pop() throws MyStackException{
		if(isEmpty()) {
			throw new MyStackException();
		}
		String data = buffer[top];
		buffer[top--] = null;
		return data; 
	}
	
	//배열의 사이즈를 늘려준다
	public void resize() {
		String[] tempBuffer = buffer;
		buffer = new String[buffer.length*2];
		for(int i=0; i<tempBuffer.length; i++) {
			buffer[i] = tempBuffer[i];
		}
		this.top=tempBuffer.length-1;
	}
}