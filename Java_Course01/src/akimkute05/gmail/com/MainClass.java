package akimkute05.gmail.com;

import java.util.Scanner;
import java.util.StringTokenizer;

final class MainClass {

	public static void main(String[] args) {
		String a, S;
		int b;
		float c, d, e;
		System.out.println("nhập xâu ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		System.out.println("nhập các từ");
		S = sc.nextLine();
		DaoXau(a); // tạo method để cho ra kết quả xâu
		DaoTu(S); // tạo method để cho ra kết quả đảo từ
		System.out.println("nhập số phần tử cho mảng");
		b = sc.nextInt();
		TinhTong(b); // tạo method để cho ra kết quả tính tổng
		System.out.println("nhập giá trị  c ");
		c = sc.nextFloat();
		System.out.println("nhập giá trị d");
		d = sc.nextFloat();
		System.out.println("nhập giá trị e");
		e = sc.nextFloat();
		PTBacNhat(c, d); // tạo 1 method tính PTB1
		PTBacHai(c, d, e); // tạo 1 method tính PTB1

	}

	private static void PTBacHai(float c, float d, float e) {
		float delta = (d * d) - 4 * c * e;
		if (c == 0) {
			if (d == 0)
				System.out.println("Phương trình bậc 2 có vô số nghiệm");
			else
				System.out.println("phương trình bậc 2 vô nghiệm");
		} else {
			if (delta == 0)
				System.out.println(" Phuong trình bậc 2 có 1 nghiệm kép x = " + (-d / (2 * c)));
			else if (delta > 0) {
				System.out.println("phương trình bậc 2 có 2 nghiệp phân biệt x1 = " + (-d - Math.sqrt(delta) / (2 * c)));
				System.out.println("phương trình bậc 2 có 2 nghiệp phân biệt x2 = " + (-d + Math.sqrt(delta) / (2 * c)));
			} else
				System.out.println("phương trình bậc 2  vô nghiệm");

		}
	}

	private static void PTBacNhat(float c, float d) {
		if (c == 0) {
			if (d == 0)
				System.out.println("Phương trình bậc nhất có vô số nghiệm");
			else
				System.out.println("phương trình bậc nhất vô nghiệm");
		} else
			System.out.println("phương trình bật nhất có nghiệm  x = " + -d / c);

	}

	private static void TinhTong(int b) {
		int arr[] = new int[b];
		System.out.println("nhập giá trị cho các phần tử ");
		for (int i = 0; i < b; i++) {
			System.out.println("arr[" + i + "]");
			Scanner nhap = new Scanner(System.in);
			arr[i] = nhap.nextInt();
		}
		int sum = 0;
		int i;
		for (i = 0; i < b; i++) {
			sum += arr[i];
		}
		System.out.println("cac gia tri " + sum);
		System.out.println("========================");

	}

	private static void DaoTu(String s) {
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
		System.out.println("Chuỗi mới Đảo từ " + kq.toString());
		System.out.println("=======================================");
	}

	private static void DaoXau(String a) {
		String reverse = new StringBuffer(a).reverse().toString();
		System.out.println("chuoi moi " + reverse);
		System.out.println("-----------------------------------");
	}

}