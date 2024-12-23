package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hangar;
import entities.Helicoptero;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do Hangar:");
		String nomeHangar = sc.nextLine();
		System.out.println("Digite a localizacao do Hangar:");
		String localizacaoHangar = sc.nextLine();
						
		System.out.println("Digite a quantidade de helicopteros");
		int quantidadeHelicoptero = sc.nextInt();
		
		for (int count = 0; count < quantidadeHelicoptero; count ++) {
			System.out.println("Digite a marca:");
			sc.nextLine();
			String marca = sc.nextLine();
			System.out.println("Digite o modelo:");
			String modelo = sc.nextLine();
			System.out.println("Digite o prefixo:");
			String prefixo = sc.nextLine();
			
			Helicoptero helicoptero = new Helicoptero(marca, modelo, prefixo);
			
			Hangar hangar = new Hangar(nomeHangar,localizacaoHangar,helicoptero);
			
			System.out.println(hangar);
		}
		
		
		
		
		
		
		
		
	}

}
