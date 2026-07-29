package funcoes_e_strings.validadorcredenciais;

import java.util.Scanner;

public class Main {

    public static boolean validarAcesso(String chave){
        if(chave.contains("admin") && chave.length() > 10){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Validar Acesso");
        String entradaSenha = input.next();
        System.out.println(validarAcesso(entradaSenha));
        
    }
    
}
