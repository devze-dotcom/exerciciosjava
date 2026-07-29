package funcoes_e_strings.normalizadorEntradas;

import java.util.Scanner;

public class Main {

    public static String normalizar(String text){
        return text.toLowerCase();
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Normalizar entrada");
    String entrada = input.next();
    System.out.println("Antes: " + entrada);
    System.out.println("Depois: " + normalizar(entrada));
}
    
}
