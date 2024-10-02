package N_collection;

import java.util.TreeSet;

public class Ex06_TreeSet {

	public static void main(String[] args) {

		TreeSet set = new TreeSet() ;
		set.add("elephant") ;
		set.add("tiger") ;
		set.add("lion") ;
		set.add("cat") ;
		set.add("dog") ;
		set.add("ant") ;
		set.add("zebra") ;
		set.add("bee") ;
		set.add("dog") ;

		System.out.println(set);  // 중복은 걸러서 출력된다 -> 중복안됨
		System.out.println(set.subSet("d", "s"));  //d부터 s사이의 애들
		System.out.println(set.headSet("e"));  // e보다 이전
		System.out.println(set.tailSet("e"));  // e보다 이후


	}

}
