package N_collection;

/*
 * 자료구조 기초
 * 
 * Stack : LIFO (Last In First Out)  =====> static 구조 
 *          나중에 들어온 데이타 먼저 나가는 구조 // 브라우저 뒤로가기구조 
 *          
 * Queue : FIFO (First In First Out)
 *         먼저 들어온 데이터가 먼저 나가는 구조 / 선입선출 - 편의점
 *         
 */

import java.util.*;

public class Ex08_StackQueue {

	public static void main(String[] args) {
		
		
		// LIFO
		Stack <String> stack = new Stack <String> ();
		stack.push("A");
		stack.push("B");
		stack.push("C");  // a->b->c 순으로 쌓이니까 C부터 꺼내와짐
		
		System.out.println("스택에서 데이타 꺼내기");
		while(!stack.empty()) {
		System.out.println(stack.pop());	
		}
		
		
		
		// FIFO
		Queue <String> queue = new LinkedList <String>();  
		queue.offer("가");
		queue.offer("나");
		queue.offer("다");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}  // end main

}
