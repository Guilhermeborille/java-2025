import java.util.Scanner;
public class MainValores {
    public static void main(String[] args){
        int valor1 = 0, valor2 = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o primeiro valor");
        valor1 = scan.nextInt();
        System.out.println("digite o segundo valor");
        valor2 = scan.nextInt();
        if(valor1 > valor2){
            for(;valor1 >=valor2;valor2++){
                if(valor2%3 == 0){
                    System.out.print(valor2+" ");
                }
                else if(valor2 %4 == 0){
                    System.out.print(valor2+" ");
                }
            }
        }
        else if(valor1 < valor2){
            for(;valor2 >=valor1;valor1++){
                if(valor1%3 == 0){
                    System.out.print(valor1+" ");
                }
                else if(valor1 %4 == 0){
                    System.out.print(valor1+" ");
                }
            }
        }
    }
}
