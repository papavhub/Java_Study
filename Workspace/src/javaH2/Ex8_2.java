package javaH2;
import java.io.*;
public class Ex8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			in = new InputStreamReader(fin, "MS949"); //US_ASCII <- ��� ����� ����
			
			int c;
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}

	}

}