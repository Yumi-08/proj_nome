package projetos_LPAaula04;

import java.util.Scanner;

public class salario {
	public static void main(String[] args) {
		// Variáveis
		double horatrab,valorhora,salbruto,salliquido,inss;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor hora de trabalho: ");
		horatrab = ler.nextDouble();
		
		System.out.print ("Informe o valor hora: ");
		valorhora = ler.nextDouble ();
		
		salbruto = horatrab * valorhora;
		inss= salbruto*0.12;
		salliquido = salbruto-inss;
		
		System.out.print("O valor do salário bruto é: " + salbruto);
		System.out.print("O valor do salário líquido é: " + salliquido);
		
		ler.close();		

		}
	
}
