package N_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03_ArrayList {

	public static void main(String[] args) {

		ArrayList <Student> result = method();

		for(Student s: result) {
			System.out.println(s);
		}
		System.out.println("[참고]-------------------");
//전체요소를 순서대로 검색할 때 : Enumeration -> Iterator
		Iterator i = result.iterator ();
		while(i.hasNext()) {
			System.out.println();
		}

	}

	static ArrayList<Student> method() {


		ArrayList<Student> list = new ArrayList<Student> ();
		list.add(new Student ("홍길자",23));
		list.add(new Student ("홍길숙",33));
		list.add(new Student ("홍길동",43));		

		return list;

	} // end of method()
} // end of class_Ex03


class Student {
	String name;
	int age;
	Student (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String ToString () {
		return name + "님 학생은" + age + "살 입니다" ;
	}
} // end of class Stu
