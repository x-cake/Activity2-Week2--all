//Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS. Utilize a estrutura de repetição que te agradar.

import java.util.Scanner;

class valores{
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int negativos = 0, i = 0;

        while (i < 10) {
            System.out.println("Digite 10 numeros inteiros quaisquer (+ ou -): ");
            int numero = valor.nextInt();
            if(numero < 0){
                negativos = negativos+1;
            }
            i = i+1;
        }
        System.out.print("A quantidade de numeros negativos é: "+negativos);

    }
}