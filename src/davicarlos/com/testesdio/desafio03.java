package davicarlos.com.testesdio;

import java.util.Locale;
import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int produtos=0, quantidade=0;
        double res=0, valor=0;
        int N = Integer.parseInt(sc.nextLine());

        for (int x=0 ; x<N ; x++){
            produtos = sc.nextInt();
            quantidade  = sc.nextInt();

            if (produtos == 1001)
                valor = 1.50;
            else if (        )
                valor =     ;
            else if (produtos ==      )
                valor =       ;
            else if (produtos ==      )                  //complete o código nos espaços em branco
                valor =    ;
            else if (produtos ==      )
                valor =        ;

            res += valor * quantidade;
        }
        System.out.printf("%.2f\n",res);
        sc.close();
    }
}
