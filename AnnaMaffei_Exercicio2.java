/*
 * Receba 3 números e mostre o maior
 * Anna Clara
 * 29/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_Exercicio2{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);

        //recebendo um valor digitado pelo usario e guardando na memoria
        System.out.print("Digite um número: ");
        int n1 = n.nextInt();

       System.out.print("Digite um número: ");
        int n2 = n.nextInt();

        System.out.print("Digite um número: ");
        int n3 = n.nextInt();

        //condicao para testar qual numero é o maior
        if((n1>n2) && (n1>n2)){
         System.out.print("O maior é: "+n1);
         }

         if ((n2>n3) && (n2>n1)){
         System.out.print("O maior é: "+n2);
         }

          else {
          System.out.print("O maior é: "+n3);
          n.close();
          }
    }
}