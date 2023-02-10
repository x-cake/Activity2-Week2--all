//Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem crescente.
//Para isso, você precisará da estrutura WHILE e de uma variável CONTADOR.

class ordemCrescente{
    public static void main(String[] args){

        int contador = 1;

        while(contador <= 10){
            System.out.printf("%d ", contador);
            contador += 1;
        }
    }
}