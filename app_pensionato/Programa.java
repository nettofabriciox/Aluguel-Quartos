package app_pensionato;

import java.util.Scanner;

import pensionato.Pensao;

public class Programa {

	public static void main(String[] args) {
	
		Scanner cs = new Scanner(System.in);
		System.out.println("Entre com quantidade de quartos");
		int num = cs.nextInt();
		
		Pensao[] p = new Pensao[10];
		for(int i=0; i<num; i++ ) {
			cs.nextLine();
			System.out.print("Entrar com nome: ");
			String nome = cs.nextLine();
			System.out.print("Entrar com email: ");
			String email = cs.nextLine();
			System.out.print("Entrar numero quarto: ");
			int quarto = cs.nextInt();
			//p[i] = new Pensao(nome, email);
			Pensao ps = new Pensao(nome, email);
			p[quarto] = ps;
		}
		
		for(int i=0; i<10; i++ ) {
			if(p[i] != null) {
				System.out.println(p[i]);
			}
			
		}

	}

}
