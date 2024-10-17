package Aula1.ExerciciosBeecrowd;
import java.util.Scanner;

public class DDD{
    public static String estado(int ddd){
        if (ddd == 11){
            return "Sao Paulo";
        }
        if (ddd == 61){
            return "Brasilia";
        }
        if (ddd == 71){
            return "Salvador";
        }
        if (ddd == 21){
            return "Rio de Janeiro";
        }
        if (ddd == 32){
            return "Juiz de Fora";
        }
        if (ddd == 19){
            return "Campinas";
        }
        if (ddd == 27){
            return "Vitoria";
        }
        if (ddd == 31){
            return "Belo Horizonte";
        }
        else{
            return "DDD nao cadastrado";
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int ddd = entrada.nextInt();
        System.out.println (estado(ddd));
    }
}