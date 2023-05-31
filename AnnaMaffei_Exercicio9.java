/*
 * Compare os números e mostre o maior ou se é maior ou igual
 * Anna Clara
 * 30/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_Exercicio9 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        //recebendo um valor digitado pelo usario e guardando na memoria
        System.out.println("Digite o primeiro valor");
        double n1 = c.nextDouble();

        System.out.println("Digite o segundo valor");
        double n2 = c.nextDouble();

            //condicao para ver se os valores digitados do usuario sao iguais, menores ou maiores
            if (n1==n2){
                System.out.println("Os valores são iguais");
            }else if (n1>n2){
                System.out.println("O primeiro número é maior");
            } else{
                System.out.println("O segundo número é maior");
            }
        c.close();
    }
}
