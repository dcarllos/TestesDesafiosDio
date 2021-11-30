package davicarlos.com.testesdio;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
            if(horasaida == 0) horasaida = 24;

        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();

        //Escreva a sua lógica aqui
        int ajuste = horasaida + tempoviagem + fuso;
            if (ajuste >= 24) ajuste = ajuste - 24;


        System.out.println(ajuste);

        sc.close();
    }
}
