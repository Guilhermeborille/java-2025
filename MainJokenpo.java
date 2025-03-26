import java.util.Scanner;
import java.util.Random;

public class MainJokenpo{
    static int userWins = 0;
    static int computerWins = 0;
    static int empates = 0;
    public static void main (String[] args ){
        int jogadasUser[] = new int[3];
        int jogadasComputer[] = new int[3];
        int userChoice;
        for(int i = 0; i < 3; i++){
            jogadasComputer[i] = 0;
            jogadasUser[i] = 0;
        }
        Scanner scan = new Scanner (System.in);
        int n = 0;
        do{
            System.out.println("digite o numero de rodadas:");
            n = scan.nextInt();
        }while (n%2 == 0);
        Random jogada = new Random();
        
        //System.out.println("o valor de n é: " + n);
        int i = 0;
        while(i < n){
            do{
                System.out.println("escolha uma opção\n 1- pedra\n 2- papel\n 3- tesoura\n");
                userChoice = scan.nextInt();
                if(userChoice > 3 || userChoice < 1){
                    System.out.println("jogada invalida\n");
                }
            }while(userChoice > 3 || userChoice < 1);


            String userChoiceString = getCastChoice(userChoice, jogadasUser);

            int computerChoice = jogada.nextInt(3) + 1;

            String computerChoiceString = getCastChoice(computerChoice, jogadasComputer);

            System.out.println(" Voce escolheu " + userChoiceString + "\n o pc escolheu " + computerChoiceString);
            
            String result = ganhador(userChoice, computerChoice);

            System.out.println(result);
            if(computerChoice != userChoice){
                i++;
            }

        }
        System.out.println("\n\njogador ganhou: " + MainJokenpo.userWins + " \npc ganhou: " +  MainJokenpo.computerWins + " \nempates " + MainJokenpo.empates);
        if(MainJokenpo.computerWins > MainJokenpo.userWins){
            System.out.println("computador ganhou\n\n");
        }
        else if(MainJokenpo.computerWins < MainJokenpo.userWins){
            System.out.println("usario ganhou\n\n");
        }
        else{
            System.out.println("empate\n\n");
        }
        System.out.println("------------------------------------------------------------\n");
        System.out.println("jogador jogou: pedra " + jogadasUser[0] + "  papel  " + jogadasUser[1]+"  tesoura  " + jogadasUser[2]);
        System.out.println("pc jogou: pedra " + jogadasComputer[0] + "  papel  " + jogadasComputer[1] + "  tesoura  " + jogadasComputer[2]);
        System.out.println("\n------------------------------------------------------------\n");
        scan.close();

    }
    public static String getCastChoice(int choice , int[] vet){
        switch(choice){
            case 1:
                vet[0]++;
                return "pedra";
            case 2:
                vet[1]++;
                return "papel";
            case 3:
                vet[2]++;
                return "tesoura";
            default:
                return "opção invalida";
        }

    }

    public static String ganhador(int jogador, int pc){
        if(jogador == 1 ){
            if(pc == 1){
                MainJokenpo.empates++;
                return "duas jogadas iguais resultam em empate";
            }
            else if(pc == 2){
                MainJokenpo.computerWins ++;
                return "pc ganhou pois papel embrulha pedra";
            }
            else if(pc == 3){
                MainJokenpo.userWins++;
                return "jogador ganhou pois pedra esmaga tesoura";
            }
        }
        else if(jogador == 2){
            if(pc == 1){
                MainJokenpo.userWins++;
                return"jogador ganhou pois papel embrulha pedra";
            }
            else if(pc == 2){
            MainJokenpo.empates++;
                return "empate";
            }
            else{
                MainJokenpo.computerWins++;
                return "pc ganhou";
            }
        }
        else if(jogador == 3){
            if(pc == 1){
                MainJokenpo.computerWins++;
                return " pc ganhou pois pedra esmaga tesoura";
            }
            else if(pc == 2){
                MainJokenpo.userWins++;
                return "jogador ganhou tesoura corte papel";
            }
            else{
                MainJokenpo.empates++;
                return "empate";
            }
        }
        return "jogada invalida";
        
    }
}