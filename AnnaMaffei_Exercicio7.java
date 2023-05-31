/*
 * Mostre "ACERTOU" se o valor for inteiro positivo em 94 e 456
 * Anna Clara
 * 29/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_Exercicio7 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        
        //recebendo um valor digitado pelo usario e guardando na memoria
        System.out.println("Digite um número (inteiro e positivo)");
        int num = m.nextInt();
            //condicao para testar se o numero digitado esta entre 94 e 456
            if ((num>0) && (num>94) && (num<456)){
            System.out.println("ACERTOU ");
            } else { 
            System.out.println("Tente novamente");
            }
        m.close();
    }    
}
