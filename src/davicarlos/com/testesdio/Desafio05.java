package davicarlos.com.testesdio;

import java.io.IOException;
import java.util.Scanner;

public class Desafio05 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        String parImpar = "", positivoNegativo = "";

        for (int i = 1; i <= N; i++) {
            int valor = leitor.nextInt();


            if (valor != 0) {
                if (valor % 2 == 0) {
                    parImpar = "EVEN";
                } else if (valor % 2 != 0) {
                    parImpar = "ODD";
                }

                if (valor > 0) {
                    positivoNegativo = "POSITIVE";
                } else if (valor < 0) {
                    positivoNegativo = "NEGATIVE";
                }
                System.out.println(parImpar + " " + positivoNegativo);
            }
            if (valor == 0) System.out.println("NULL");

        }
    }
}
