package N_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex07_HaxhMap {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		HashMap<String,String> map = new HashMap <String,String> ();
		//    아이디 비밀번호
		map.put("javassem", "1111");
		map.put("javababo","9999");
		map.put("kimjava","9999");
		map.put("javassem","1234");  //똑같은 키값이 있으면 상단의 키값을 덮어버림 즉 1111은 사용불가 1234만 가능(로그인된다)


		while (true){  //true로 잡고 끝내는 기점 잡기 언제끝낼것인가? 즉 로그인 끝냇을때! 시점을 break 로 잡아주기
			System.out.println("아이디 입력하세요");
			String id = input.nextLine();

			System.out.println("비밀번호 입력하세요");
			String pw = input.nextLine();

			if(map.containsKey(id)) {
				if( (map.get(id) ) .equals (pw)) {   //== 아니고 String 이니까 equals 로 
					System.out.println("로그인 성공"); 
					break;   // 멈추는곳 로그인된ㄴ 시점
				} else { 
					System.out.println("비밀번호가 일치하지 않습니다");
				//continue;
				}
			}else {
				System.out.println("존재하지 않는 아이디입니다");
				//continue;			
			}
			//구현부분
		}
	}

}
