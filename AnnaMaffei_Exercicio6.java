/*
 * Calcule o valor total da compra de picolé
 * Anna Clara
 * 29/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_Exercicio6 {
    public static void main(String[] args) {
        Scanner compra = new Scanner(System.in);
        //inicializacao das variaveis e do seu valor
        double total=0.00;

        //recebendo um valor digitado pelo usario e guardando na memoria
        System.out.println("Quantidade de kiwi: ");
        int kiwi = compra.nextInt();

        System.out.println("Quantidade de laranja: ");
        int laranja = compra.nextInt();

        System.out.println("Quantidade de romã: ");
        int roma = compra.nextInt();

        ////variavel recebendo o calculo total das variaveis com seus respectivos valores
        total=((kiwi*03.20)+(laranja*02.39)+(roma*07.99));
        System.out.println("O valor total é: "+total);
        compra.close();
    }
}
