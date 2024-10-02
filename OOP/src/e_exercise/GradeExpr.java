package e_exercise;

public class GradeExpr {

	int [] jumsu;  // (배열변수)멤버변수라고 함


	// 멤버함수 , ()로 나와있음 
	GradeExpr (int [] jumsu) {  // 매개변수 int[]jumsu 값 할당
		this.jumsu = jumsu; //이 안의 점수값은 멤버변수의 점수값을 표시함
	}

	double getAverage() { // jumsu배열변수에 저장된 점수들의 평균
		double avg = getTotal() / jumsu.length; //
		return avg;  // 평균 리턴
	}

	int getTotal () {  //jumsu 배열변수에 저장된 점수들의 합
		int total = 0;  // 합 변수 만듦
		for(int i = 0; i<jumsu.length; i++) {
			total += jumsu[i]; 
		}

		return total ;  // 합변수 리턴
	}

}










