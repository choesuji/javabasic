package b_operator;

public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a;
		a = 5;
		// int a = 5; 이렇게 쓰기
				
		int b;
		b = 7;
		// int b = 7; 이렇게 쓰기
		
		System.out.println("A=" +a +",B=" + b);
		System.out.println("A=" +a+1 +",B=" +b+1); // [주의] 
		                  // A=51
		System.out.println("A=" +(a+1) +",B=" + (b+1));
		
		
		a = a + 1; 
		b = b + 1; 
		System.out.println("A="+ a +",B="+b);
		
		//증가감소연산자
		a++; // a = a + 1  
		b--; // b = b - 1  
		System.out.println("A= "+ a +"B= " + b);
		
		++a; // a = a + 1  
		--b; // b = b - 1  
		System.out.println("A= "+ a +"B= " + b);
				
//-----------------------------------------
		int z=10, y=10;
		int result = ++z;  //z=z+1 result =z;
		System.out.println(result);  // 11
		
		int result2 = y++;  //int result2 = y; y=y+1; <- 일단 y값은 10이고, 그리고나서 ++로
		     // 10                                    //y=11이 되니까 원래 기존에 10이 result2 값이 된다.
		System.out.println(result2);
		
	    
		System.out.println("Z=" + z+",Y=" +y); // z=11 y=11
		
		System.out.println("Z=" + ++z +",Y=" + --y); // z=12 y=10
		
		System.out.println("Z=" + z++ +",Y=" + y--); // z=12 y=10
		
		System.out.println("Z=" + z+",Y=" +y); // z=11 y=11
		
	}

}
