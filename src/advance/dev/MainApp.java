package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arr[] = new Student[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("nhap vao 10 nguoi");
			System.out.println("nhap vao nguoi thu"+(i+1));
			arr[i] = new Student();
			System.out.println("nhap ten");
			arr[i].name = sc.nextLine();
			System.out.println("nhap tuoi");
			arr[i].old = sc.nextInt();
			System.out.println("nhap dia chi");
			sc.nextLine();
			arr[i].diachi = sc.nextLine();
			System.out.println("nhap vao diem");
			arr[i].dtb = sc.nextFloat();
			sc.nextLine();
		}
//		//in ra danh sach
		In(arr);
	}
	static void In (Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("nguoi thu: "+(i+1));
			System.out.println(arr[i]);
		}
	}
		
	
}
			
			
		