package application;

import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		rect.height = sc.nextDouble();
		rect.width = sc.nextDouble();
		
		System.out.println(rect);
		
		sc.close();

	}

}
