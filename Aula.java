import java.util.Scanner;
import java.util.Random;

public class Aula{
    static int userWins = 0;
    static int computerWins = 0;
    static int empates = 0;
    public static void main (String[] args ){
        Scanner scan = new Scanner (System.in);
        System.out.println("digite o numero de rodadas:");
        int n = scan.nextInt();
        Random jogada = new Random();
        
        System.out.println("o valor de n é: " + n);

        for(int i = 0; i<n; i++){
            System.out.println("escolha uma opção 1- pedra 2- papel 3- tesoura");
            int userChoice = scan.nextInt();

            String userChoiceString = getCastChoice(userChoice);

            int computerChoice = jogada.nextInt(3) + 1;

            String computerChoiceString = getCastChoice(computerChoice);

            System.out.println(" Voce escolheu " + userChoiceString + " o pc escolheu " + computerChoiceString);
            
            String result = ganhador(userChoice, computerChoice);

            System.out.println(result);

        }
        System.out.println("jogador ganhou: " + Aula.userWins + "pc ganhou: " +  Aula.computerWins + " empates " + Aula.empates);

        scan.close();

    }
    public static String getCastChoice(int choice){
        switch(choice){
            case 1:
                return "pedra";
            case 2:
                return "papel";
            case 3:
                return "tesoura";
            default:
                return "opção invalida";
        }

    }

    public static String ganhador(int jogador, int pc){
        if(jogador == 1 ){
            if(pc == 1){
                Aula.empates++;
                return "duas jogadas iguais resultam em empate";
            }
            else if(pc == 2){
                Aula.computerWins ++;
                return "pc ganhou pois papel embrulha pedra";
            }
            else if(pc == 3){
                Aula.userWins++;
                return "jogador ganhou pois pedra esmaga tesoura";
            }
        }
        else if(jogador == 2){
            if(pc == 1){
                Aula.userWins++;
                return"jogador ganhou pois papel embrulha pedra";
            }
            else if(pc == 2){
                Aula.empates++;
                return "empate";
            }
            else{
                Aula.computerWins++;
                return "pc ganhou";
            }
        }
        else if(jogador == 3){
            if(pc == 1){
                Aula.computerWins++;
                return " pc ganhou pois pedra esmaga tesoura";
            }
            else if(pc == 2){
                Aula.userWins++;
                return "jogador ganhou papel embrulha pedra";
            }
            else{
                Aula.empates++;
                return "empate";
            }
        }
        return "jogada invalida";
        
    }
}