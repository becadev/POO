package Aula1.ExerciciosBeecrowd;
import java.util.Scanner;

public class Fliper {

    public static String caminho(int p, int r){
        String caminho = "x";
        if(p==0){
            caminho = "C";

        } if (p==1){
            if (r==0){
                caminho = "B";
            }else{
                caminho = "A";
            }
        }
        return caminho;
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int p = entrada.nextInt();
        int r = entrada.nextInt();
        System.out.println(caminho(p,r));

    }
}