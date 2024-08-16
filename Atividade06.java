import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double n1, n2, n3, n4 , media;
        String nome;

        System.out.print("Digite Seu nome: ");
        nome = input.next();

        System.out.print("Digite Sua Primeira Nota: ");
        n1 = input.nextDouble();

        System.out.print("Digite sua Segunda Nota: ");
        n2 = input.nextDouble();

        System.out.print("Digite sua Terceira Nota: ");
        n3 = input.nextDouble();

        System.out.print("Digite sua Quarta Nota: ");
        n4 = input.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        if(media >= 7){
            System.out.printf("Parabens %s Passou com a media de %.2f", nome, media);
        }else if(media < 7 && media >= 4){
            System.out.printf("Sinto muito %s Esta em Recuepração com media de %.2f", nome, media);
        }else{
            System.out.printf("Infelizmente Reprovado %s Com media de %.2f", nome, media);
        }
    } 
}
