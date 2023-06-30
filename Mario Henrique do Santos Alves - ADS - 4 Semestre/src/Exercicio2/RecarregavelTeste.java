package Exercicio2;

import java.util.Scanner;

public class RecarregavelTeste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o modelo do celular: ");
        String modeloCelular = scanner.nextLine();

        System.out.print("Digite o nivel de bateria inicial do celular: ");
        int nivelBateria = scanner.nextInt();

        Celular celular = new Celular(modeloCelular, nivelBateria);
        System.out.println(celular);

        if (celular.precisaRecarregar()) {
            System.out.println("O celular precisa ser recarregado!"); 
        } else {
            System.out.println("O celular esta com a bateria ok!");
        }
        
        System.out.println();

        System.out.print("Digite o nivel de carga inicial da bateria: ");
        int nivelCarga = scanner.nextInt();

        Bateria bateria = new Bateria(nivelCarga);
        System.out.println(bateria);

        if (bateria.precisaRecarregar()) {
            System.out.println("A carga da bateria esta baixa!.");
        } else {
            System.out.println("A carga da bateria esta ok!");
        }


        scanner.close();
    }
}

