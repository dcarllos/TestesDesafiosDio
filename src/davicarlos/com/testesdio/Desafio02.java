package davicarlos.com.testesdio;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            double qtd = 1;
                for (int j = 0; j < x; j++) {
                    qtd = qtd *2;
                }
                qtd = Math.floor((qtd /12) /1000);
            System.out.printf("%.0f kg\n", qtd);
        }
    }
}
