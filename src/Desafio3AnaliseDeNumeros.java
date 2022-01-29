import java.io.IOException;
import java.util.Scanner;

public class Desafio3AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int pares  = 0;
        int impares  = 0;
        int positivos = 0;
        int negativos = 0;
        int numero;

        for (int i = 0; i < 5; i++) {
            numero = leitor.nextInt();
            if (numero % 2 == 0) pares ++;
            else impares ++;
            if (numero < 0) negativos ++;
            else if (numero > 0) positivos ++;
        }

        System.out.println(pares + " par(es)");
        System.out.println(impares + " impar(es)");
        System.out.println(positivos + " positivo(s)");
        System.out.println(negativos + " negativo(s)");
    }

}
