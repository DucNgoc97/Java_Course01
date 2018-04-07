package akimkute05.gmail.com;

import java.util.Scanner;

public class DaoXau {

	public static void main(String[] args) {
		String a;
		System.out.println(" hãy nhập xâu kí tự");
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		String reverse = new StringBuffer(a).reverse().toString();
		System.out.println("chuoi moi " + reverse);
	}

}
