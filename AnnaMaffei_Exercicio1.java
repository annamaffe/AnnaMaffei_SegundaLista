/*
 * Capture um valor e desconte 15%
 * Anna Clara
 * 28/05/23
 */
import java.util.Scanner;
    public class AnnaMaffei_Exercicio1{
        public static void main(String[] args) {

            //inicializacao das variaveis e do seu valor
            double desconto=0;
            Scanner v = new Scanner(System.in);

            //recebendo um valor digitado pelo usario e guardando na memoria
            System.out.println("Digite um valor");
            double valor = v.nextDouble();
            //variavel recebendo o valor digitado pelo usuario e fazendo um calculo
            desconto=(valor/100)*15;
            
            System.out.println("O valor original é: "  + valor);
            System.out.println("O valor com desconto é: "  + desconto);
            v.close();
        }
    } 