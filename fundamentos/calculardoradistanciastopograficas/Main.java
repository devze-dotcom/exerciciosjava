package fundamentos.calculardoradistanciastopograficas;

import java.util.Scanner;

public class Main {

    public static int valorAproximado(double a, double b){
        double n = a + b;
        return (n >= 0) ? (int)(n + 0.5) : (int)(n - 0.5);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] distancias = new double[2];

        for(int i = 0; i < distancias.length; i++){
            System.out.printf("Digite o %d Valor: ", i + 1);
            distancias[i] = input.nextDouble();
        }

        

        System.out.println(valorAproximado(distancias[0], distancias[1]));


    }
}