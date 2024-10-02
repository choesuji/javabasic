package d_array;

public class Ex03_로또 {

	public static void main(String[] args) {
		
		int [][] lotto = new int [6][5];
		
		// 값지정 임의의 값
		for (int i = 0; i < lotto.length; i++) {
			int temp = (int) (Math.random()*45)+1;
			System.out.println(temp + "/");  // 숫자 6개 출력완료
		} 
		for(int k = 0; k<lotto.length; k++ ) {
			
		}
		
		// 출력

	}

}
int strike =0, ball=0;
for(int i=0 ;i < baseball.length;i++) {
	for(int j =0; j<answer.length; j++) {
		if (baseball [i] == baseball [j]) {
			if (i==j) strike++;
			else ball++;