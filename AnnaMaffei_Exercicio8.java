/*
 * Checar se as informoções para assistir estão certas
 * Anna Clara
 * 29/05/23
 */
import java.util.Scanner;


public class AnnaMaffei_Exercicio8 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        //inicializacao das variaveis e do seu valor
        double valor=0.0;
        int classe=0;
        String filme="Barbie, o filme"; 
        char conf='a';
        
        //algumas mensagens informativas para o usuario
        System.out.println("CINEMA");
        System.out.println("Filme em cartaz: "+filme);
        System.out.println("O valor do ingresso: 20 reais");

        //recebendo um valor digitado pelo usario e guardando na memoria
        System.out.println("insira sua idade");
        classe = f.nextInt();

        System.out.println("Informe o valor que você irá pagar");
        valor = f.nextDouble();

            //condicao para testar as informacoes do usuario        
            if ((classe>=12) && (valor>=20.00)){
                conf='S';
                System.out.println("Está tudo certo"+conf);
            } else{
                conf='N';
                System.out.println("Tente novamente"+conf);
            }
            f.close();
    }
}