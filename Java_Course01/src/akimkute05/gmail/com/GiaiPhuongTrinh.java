package akimkute05.gmail.com;

import java.util.Scanner;

public class GiaiPhuongTrinh {

	public static void main(String[] args) {
		float a, b, c;
		System.out.println("nhập giá trị  a ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		System.out.println("nhập giá trị b");
		b = sc.nextFloat();
		System.out.println("nhập giá trị c");
		c = sc.nextFloat();
		PTBacNhat(a, b); // tạo 1 method
		PTBacHai(a, b, c);

	}

	private static void PTBacHai(float a, float b, float c) {
		float delta = (b * b) - 4 * a * c;
		if (a == 0) {
			if (b == 0)
				System.out.println("Phương trình có vô số nghiệm");
			else
				System.out.println("phương trình vô nghiệm");
		} else {
			if (delta == 0)
				System.out.println(" Phuong trình có 1 nghiệm kép x = " + (-b / (2 * a)));
			else if (delta > 0) {
				System.out.println("phương trình có 2 nghiệp phân biệt x1 = " + ( - b - Math.sqrt(delta) / (2 * a)));
				System.out.println("phương trình có 2 nghiệp phân biệt x2 = " + ( - b + Math.sqrt(delta) / (2 * a)));
			} else
				System.out.println("phương trình vô nghiệm");

		}

	}

	private static void PTBacNhat(float a, float b) {
		if (a == 0) {
			if (b == 0)
				System.out.println("Phương trình có vô số nghiệm");
			else
				System.out.println("phương trình vô nghiệm");
		} else
			System.out.println("phương trình có nghiệp x = " + -b / a);

	}
}
