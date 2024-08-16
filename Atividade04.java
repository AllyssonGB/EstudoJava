public class Atividade04 {
    public static void main(String[] args){
        double nota1 = 6, nota2 = 6, nota3 = 9, nota4 = 7;
        double res = (nota1+nota2+nota3+nota4) / 4;
        if(res >= 7){
            System.out.println("Aprovado");
        }else if(res < 7){
            System.out.println("Reprovado !!!");
        }
    }
}
