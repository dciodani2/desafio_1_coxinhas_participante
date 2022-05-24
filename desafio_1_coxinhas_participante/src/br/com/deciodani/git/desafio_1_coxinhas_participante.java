package br.com.deciodani.git;
import java.util.Scanner;

public class desafio_1_coxinhas_participante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double H = scan.nextInt();
		double P = scan.nextInt();
	    
	    double media = (H / P);
	    
	    System.out.printf("%.2f",  + media );
	}

}
