 /*
 * Receba um numero, mostre o sucessor, o numero e seu antecessor
 * Anna Clara
 * 29/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_Exercicio5 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        //inicializacao das variaveis e do seu valor
        int sucessor=0;
        int antecessor=0;

        //recebendo um valor digitado pelo usario e guardando na memoria
        System.out.print("Informe um número: ");
        int num = n.nextInt();

        //duas variaveis recebendo um numero, uma fazendo -1 e outra +1
        sucessor=num+1;
        antecessor=num-1;
        System.out.println("O sucessor é: "+sucessor);
        System.out.println("O número é: "+num);
        System.out.println("O antecessor é: "+antecessor);

        n.close();
     }
}
