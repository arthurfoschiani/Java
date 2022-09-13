package entrada_processamento_saida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String r = "S";
		
		while(r.equals("S")) {
			
			List<Integer> lista = new ArrayList<>();
			
			int i, num, soma, qntd;
			
			System.out.printf("Digite a quantidade de números que deseja inserir: ");
			qntd = ler.nextInt();
	
			for (i = 1; i <= qntd; i++) {
				System.out.printf("Digite o %dº número: ", i);
			    num = ler.nextInt();
			    lista.add(num);
			}
			
			List<Integer> positivo = new ArrayList<>();
			List<Integer> negativo = new ArrayList<>();
			soma = 0;
			
			Collections.sort(lista);
	
			System.out.printf("O maior valor é %d\n", lista.get(lista.size() - 1));
			System.out.printf("O menor valor é %d\n", lista.get(lista.size() - lista.size()));
			System.out.printf("A soma desses valores é %d\n", soma);
			System.out.printf("A média desses valores é %d\n", soma/lista.size());
			for (Integer item : lista) {
	            if (item >= 0)
	                positivo.add(item);
	            else
	            	negativo.add(item);
	        }
			System.out.printf("A porcentagem de números positivos é %d porcento\n", (positivo.size()/lista.size())*100);
			System.out.printf("A porcentagem de números negativos é %d porcento\n", (negativo.size()/lista.size())*100);

			
			
			System.out.printf("Você deseja realizar uma nova execução? (S/N) ");
			r = ler.next().toUpperCase();

		    while (!r.equals("S") && !r.equals("N")){
		    	System.out.printf("Resposta inválida, digite novamente: ");
		    	r = ler.next().toUpperCase();
		    }
		}
	}

}
