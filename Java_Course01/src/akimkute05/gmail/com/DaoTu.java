package akimkute05.gmail.com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DaoTu {

	public static void main(String[] args) {
		String s;
		System.out.println("hãy cho chuỗi kí tự");
		Scanner nhap = new Scanner(System.in);
		s = nhap.nextLine();
		// sử dụng mản để lưu từng token
		String[] a = new String[100];
		StringBuilder kq = new StringBuilder();
		int length = 0;
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			// ghi từng token vào mảng
			a[length] = st.nextToken();
			length++;
		}

		// đảo ngược
		for (int i = length - 1; i >= 0; i--) {
			kq.append(a[i]);
			kq.append(' ');
		}
		System.out.println(kq.toString());
	}

}
