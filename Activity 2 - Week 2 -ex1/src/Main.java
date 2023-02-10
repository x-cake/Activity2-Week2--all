//Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja,
//para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.

import java.util.Scanner;

class valores{
    public static void main(String[] args){
        Scanner valores = new Scanner(System.in);
        float n1, n2;

        System.out.print("Digite um numero: ");
        n1 = valores.nextFloat();

        do {
            System.out.print("Digite outro numero, DIFERENTE de 0: ");
            n2 = valores.nextFloat();
        }while(n2 == 0);

        if(n2 != 0) {
            float div = n1 / n2;
            System.out.print(div);
        }

    }
}