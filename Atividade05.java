import java.util.Scanner;
public class Atividade05 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n1 = 0, n2 = 0, res = 0;
        String nome;

        System.out.print("Digite um numero: ");
        n1 = scan.nextInt();

        System.out.print("Digite outro numero: ");
        n2 = scan.nextInt();

        res = n1 + n2;

        System.out.print("Digite seu nome: ");
        nome = scan.next();

        System.out.printf("O Resultado da soma entre %d é %d é igual a %d",n1,n2,res);
        System.out.printf("\nPrograma Finalizado %s", nome);
    }
}
