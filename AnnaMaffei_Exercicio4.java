/*
 * Receba 2 valores e troque-os
 * Anna Clara
 * 29/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_Exercicio4 {
    public static void main(String[] args){
        Scanner v = new Scanner(System.in);
        
        //inicializacao das variaveis e do seu valor
        double v3=0;

        //recebendo um valor digitado pelo usario e guardando na memoria
        System.out.print("Informe um valor: ");
        double v1 = v.nextDouble();

        System.out.print("Informe um valor: ");
        double v2 = v.nextDouble();
        //uma terceira variavel para receber o valor inicial do primeiro valor, e poder armazenar
        v3=v1;
        v1=v2;
        v2=v3;
        System.out.println("A inversão fica: "+v1 +' ' +v2);
        v.close();
     }
}
