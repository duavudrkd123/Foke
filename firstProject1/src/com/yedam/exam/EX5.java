/* 구구단
		int num = 2;
		for (; num <= 9;) {
			for (int l = 1; l <= 9; l++) {
				System.out.println(num + " * " + l + " = " + (num * l));

			}
			num++; */
package com.yedam.exam;

public class EX5 {
	public static void main(String[] args) {
// 중첩 for문을 사용하여 방정식 4x+ 5y = 60의 모든 해를 구해 xy형태로 출력해보시오, x, y는 10이하의 자연수	
			for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60)
					System.out.println("(" + x +"," + y + ")");
			}
		}

	}

}
