package bullsAndCows;

import java.util.Scanner;

public class BullsAndCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int result[] = new int[3]; // ���� ���ϱ�	
		result[0] = (int)(Math.random() * 9) + 1; // ù��° ���� 0 �ȵ�
		for(int i = 1 ; i < result.length ; i++) {
			result[i] = (int)(Math.random() * 10);
			for(int j = 0 ; j < i ; j++) { // �ߺ�����
				if(result[i] == result[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0 ; i < result.length ; i++) { // ���� ��� // Ȯ�ο�
			System.out.print(result[i] + " ");
		}
		
		while(true) {
			
		int input[] = new int[3]; // ��������׼� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		for(int i = 0 ; i < input.length ; i++) {
			input[i] = sc.nextInt();	
		}
		
		int check = 1;
		for(int i = 0 ; i < result.length ; i++) {// ���� �Է��ϸ� break;
			if(result[i]!=input[i]) {
				check = 0;
			}
		}		
		if(check==1) {
			System.out.println("�����Դϴ�!");
			break;
		}
		
		
		
		int strike = 0;
		int ball = 0;
		
		for(int i = 0 ; i < result.length ; i++) {
			for(int j = 0 ; j < input.length ; j++) {
				if(result[i] == input[j]) {
					if(i==j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		
		if((strike==0)&&(ball==0)) {
			System.out.println("Out");
		}else {
			System.out.println("strike : " + strike + "\nball : " + ball);
		}
		
		

		}

	}

}