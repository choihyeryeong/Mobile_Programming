package kr.ac.kookmin.stack;

public class StackGeneric {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}


class Stack<T> {
	Node<T> top;
	
	public T pop() {
		T a = top.getData();
		top = top.getNext();
		return a;
	}
	
	public void push(T a) {
		if(top==null){
			top = new Node<T>(a);
		}
		else{
			Node<T> nextN = new Node<T>(a);
			nextN.setNext(top);
			top = nextN;
		}
		
	}
}

class Node<T> {
	Node<T> next;
	T data;
	public Node(T a) { data= a; }
	public T getData() { return data; }
	public Node<T> getNext() { return next; }
	public void setNext(Node<T> b) { next = b; }
}



