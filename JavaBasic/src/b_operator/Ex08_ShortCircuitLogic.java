package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a = 3;
		if (a>3 && ++a >3) {                  // 1번조건 : false   2번조건 : True
			System.out.println("조건만족");	  // 이미 앞에 F가 나와서 뒤에 T던 F던 3이 나옴
		}
            System.out.println("A=" + a);
            
            //-----------------------------------
            
            int b = 3;
            if (b>1  |  ++b>3) {               //1번조건 : True
            	                               //or은 앞에 true니까 4가 됨
            	System.out.println("조건만족2");
            	}
            System.out.println("B=" + b);     
                  
	}
}
