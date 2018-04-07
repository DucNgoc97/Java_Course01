package akimkute05.gmail.com;

import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		int a;
		System.out.println("nhập số phần tử của mảng");
		Scanner nhap = new Scanner(System.in);
		a = nhap.nextInt();
		int b[] = new int[a];
		System.out.println("nhập giá trị cho các phần tử ");
		for (int i = 0; i < a; i++) {
			System.out.println("arr[" + i + "]");
			b[i] = nhap.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a; i++) {
			sum += b[i];
		}
		System.out.println("cac gia tri " + sum);

	}

}
