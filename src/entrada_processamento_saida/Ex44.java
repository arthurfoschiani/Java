package entrada_processamento_saida;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		
		int i, num, soma;

		for (i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: ", i);
		    num = ler.nextInt();
		    while (num < 0) {
		    	System.out.printf("Digite o %dº valor novamente: ", i);
			    num = ler.nextInt();
		    }
		    lista.add(num);
		}
		
		soma = 0;		
		int maxValue = 0;
		int minValue = 0;
		
		for (Integer integer : lista) {
            if (integer > maxValue)
                maxValue = integer;
            else if (integer < minValue)
                minValue = integer;
            soma += integer;
        }

		System.out.printf("O maior valor é %d\n", maxValue);
		System.out.printf("A soma desses valores é %d\n", soma);
		System.out.printf("A média desses valores é %d\n", soma/lista.size());

	}

}
