package javaH2;
import java.io.*;
public class Ex8_6FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			
			int n = 0, c;
			while((c = fin.read())!= -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("c:\\Temp\\test.out���� ���� �迭�� ����մϴ�.");
			for(int i=0 ; i<b.length ; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			fin.close();
		}catch(IOException e) {
			System.out.println("c:\\Temp\\test.out���� ���� ���߽��ϴ�. ��θ��� Ȯ���� �ּ���");
			return;
		}
	}

}