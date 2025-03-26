import java.util.Scanner;
public class MainNotas {
    public static void main(String[] args){
        Scanner notas = new Scanner(System.in);
        float nota1, nota2, nota3, nota4;
        int media;

        do{
            System.out.println(" digite a primeira nota");
            nota1 = notas.nextFloat();
            if(nota1 < 0 || nota1> 10){
                System.out.println("as notas são de 0 a 10");
            }
        }while(nota1<0 || nota1>10);

        do{
            System.out.println(" digite a segunda nota");
            nota2 = notas.nextFloat();
            if(nota2 < 0 || nota2> 10){
                System.out.println("as notas são de 0 a 10");
            }
        }while(nota2<0 || nota2>10);

        do{
            System.out.println(" digite a terceira nota");
            nota3 = notas.nextFloat();
            if(nota3 < 0 || nota3> 10){
                System.out.println("as notas são de 0 a 10");
            }
        }while(nota3<0 || nota3>10);

        do{
            System.out.println(" digite a quarta nota");
            nota4 = notas.nextFloat();
            if(nota4 < 0 || nota4> 10){
                System.out.println("as notas são de 0 a 10");
            }
        }while(nota4<0 || nota4>10);

        media =  (int)  ((nota1 + nota2 + nota3 + nota4)/4) * 10;
        

        System.out.println(validarNotas(media));
    }
    public static String validarNotas(int conceito){
        while(conceito <= 100){
            switch (conceito) {
                case 59:
                    return "conceito D - reprovado";

                case 74:
                    return"conceito c - aprovado";
                case 89:
                    return "conceito B - aprovado";
                case 100:
                    return "conceito A - aprovadissimo";
            }
            conceito++;
        }
        return "guilherme sou eu";
    }
}
