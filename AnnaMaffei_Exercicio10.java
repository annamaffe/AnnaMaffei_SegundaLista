/*
 * Receba um número e mostre se ele é impar ou par
 * Anna Clara
 * 30/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_Exercicio10 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        //recebendo um valor digitado pelo usario e guardando na memoria
        System.out.println("Digite um valor:");
        int num = n.nextInt();

            //testando se o resultado da divisao do numero do usuario der 0, o numero é par, senao impar
            if ((num%2)==0){
                System.out.println("O número é par");
            } else{
                System.out.println("O número é ímpar");
            }
        n.close();
    }
}
