package N_collection;

public class Ex09_Generics {

	public static void main(String[] args) {

		      // 1번      2번
		MyType<String, String> name = new MyType ("이름", "김자바");
		MyType <String, Integer> age = new MyType ("나이",new Integer(44));  //쓰지말라는 표시 
		MyType <String, Double> height = new MyType ("키",new Double(130.99));

		System.out.println(name.getName() + "/" + name.getValue());
		System.out.println(age.getName() + "/" + age.getValue());


	}

} // end class 
class MyType <K, V> { //키값  1번은 k값으로 2번은 v값으로

	K name;
	V value;
	MyType(K name,V value ) {
		this. name = name;
		this.value = value;
	}

	K getName () {
		return name;

	}

	V getValue () {
		return value;
	}
} // end class My