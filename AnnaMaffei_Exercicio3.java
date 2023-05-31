/*
 * Calcule a area
 * Anna Clara
 * 29/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_Exercicio3 {
     public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        
        //inicializacao das variaveis e do seu valor
        double area=0;

        //recebendo um valor digitado pelo usario e guardando na memoria
        System.out.print("Informe a base do triângulo: ");
        double base = c.nextDouble();

        System.out.print("Informe a altura do triângulo: ");
        double alt = c.nextDouble();

        //variavel recebendo o valor da base digitado pelo usuario e fazendo o calculo
        area=((base*alt)/2);
        System.out.println("A área do triângulo é: "+area);
        c.close();
     }
}
