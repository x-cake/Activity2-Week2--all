//Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente.
//Para isso, você precisará da estrutura WHILE e de uma variável CONTADOR.

class ordemDecrescente{
    public static void main(String[] args) {

        int contador = 10;

        do{
            System.out.printf("%d ", contador);
            contador = contador - 1;
        }while(contador >= 1);

    }
}