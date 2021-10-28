package com.birdgelabe.LineComparison;

import java.util.Scanner;

public class LineComparison {
	public static int x, x1, x2, x3, y, y1, y2, y3;
	public static double distance1, distance2;

	public static void main(String[] args) {
		System.out.println("Welcome to Line comparison program ");
		input();
		distance();
	}

	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of x = ");
		int x = sc.nextInt();
		System.out.print("enter the value of x1 = ");
		int x1 = sc.nextInt();
		System.out.print("enter the value of y = ");
		int y = sc.nextInt();
		System.out.print("enter the value of y1 = ");
		int y1 = sc.nextInt();

		double distance = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
		System.out.println("Distance = " + distance);
	}

	public static void distance() {
		distance1 = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
		System.out.println("Distance = " + distance1);
		distance2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		System.out.println("Distance = " + distance2);

	}
}
