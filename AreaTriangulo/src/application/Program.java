package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x;
		
		x = new Triangle();		
		
		System.out.println("Digite area");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		double areaX = x.area();
		
		System.out.printf("Area Triangulo X: %.4f%n",areaX);		

	}

}