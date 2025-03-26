import java.util.Scanner;
public class MainCaixaEletronico {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in) ;
        int op ;
        float saldo = 0, deposito = 0 , saque = 0 ;
        do{
            System.out.println("CAIXA ELETRONICO\n");
            System.out.print("1)ver saldo\n2)deposito\n3)saque\n0)sair\n>");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("seu saldo é:"+saldo);
                    break;
                case 2:
                    deposito = scan.nextFloat();
                    saldo += deposito;
                    break;
                case 3:
                    saque = scan.nextFloat();
                    saldo -= saque;

            }
        }while(op != 0);
    }
}
