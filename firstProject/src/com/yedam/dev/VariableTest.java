package com.yedam.dev;

public class VariableTest {
 public static void main(String[] args) {
	 	//b = b + 1;
	 	 // 1 ~ 10���� ���ϱ�
int b = 0;
int sum = 0;
for(int i = 0; i < 10; i++) //�ݺ�Ƚ������ b�� �� �־�� i�� �ݺ�Ƚ��
	{ b = b + 1;
	sum = sum + b; // sum += b
	System.out.println("sum = " + sum + ", b =" + b);
	}
 }
}
