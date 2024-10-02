package N_collection;

import java.util.*;

public class Ex04_Set {

	public static void main(String[] args) {
		
		Set set = new HashSet ();  //중복값은 출력안된다  -> 처음부터 출력되지 않는다 ex) 로또
		
		set.add("zebra");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("dog");
		set.add("dog");   
		
		System.out.println(set);
		
	}

}
