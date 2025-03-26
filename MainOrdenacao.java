import java.util.Scanner;
import java.util.Random;
public class MainOrdenacao {
    public static void main(String[] args){

        int vet[] = new int[30], aux= 0, op=0;
        Random alea = new Random();
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<30; i++){
            vet[i] = alea.nextInt(301);
            //System.out.println(vet[i]+ "  ");
        }

        do{
            System.out.print("1)ordenar de forma crescente\n2)ordenar de forma decrescente\n>");
            op = scan.nextInt();
        }while(op<0 && op > 3);
        if(op == 1){
            for(int i = 0; i<30; i++){
                for (int j = 0; j<29; j++){
                    if(vet[j] > vet[j+1]){
                        aux = vet[j];
                        vet[j] = vet[j+1];
                        vet[j+1] = aux;
                    }
                }
            }
        }
        else if(op == 2){
            for(int i = 0; i<30; i++){
                for (int j = 0; j<29; j++){
                    if(vet[j] < vet[j+1]){
                        aux = vet[j];
                        vet[j] = vet[j+1];
                        vet[j+1] = aux;
                    }
                }
            }
        }


        for(int i = 0; i<30; i++){
            //vet[i] = alea.nextInt(301);
            System.out.println(vet[i]+ "  ");
        }

    }
}
