package l_abstract;

public class PolySample {

	public static void main(String[] args) {


		Item[] result = method();
		//처리(출력)
		for(int i = 0; i<result.length;i++) {
			Item item = (Item)result[i]; // Object -> item 형변환
			item.output();  //똑같은상황이지만 상황에따라 다양하게 불려져서 다형성
		}

	}

	static Item[] method () { // Object[]로 받아주기

		//데이타
		Book b = new Book ("001","파이썬","ICT","누군가");
		Dvd d = new Dvd ("001","파이썬","ICT","누군가");
		Cd c = new Cd ();

		Item[] obj= new Item [3];
		obj[0] = b;
		obj[1] = d;
		obj[2] = c;

		return obj;  // static 에 넘겨주기 -> 

	}
}


