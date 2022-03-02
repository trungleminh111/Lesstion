package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr [] = new Person[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("nhap vao 5 nguoi");
			arr[i] = new Person();
			arr[i].name = sc.nextLine();
			arr[i].old = sc.nextInt();
			sc.nextLine();
		}
		//in ra danh sach
		for (int i = 0; i < arr.length; i++) {
			System.out.format("name: %s-old: %d", arr[i].name, arr[i].old);
		}
		Person max = arr[0];
		//in ra danh sach
		for (int i = 0; i < arr.length; i++) {
			if( max.old < arr[i].old)
				max = arr[i];
		}
		System.out.format("Ten: %S - Tuoi: %d",max.name,max.old);
		System.out.println("Nguoi lon tuoi nhat la: " + max.old);
		System.out.println("Ten nguoi lon tuoi nhat la :" + max.name);
	}
}
			
			
		