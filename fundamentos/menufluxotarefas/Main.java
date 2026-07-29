package fundamentos.menufluxotarefas;

import java.util.Scanner;

public class Main {

    public static void menu(int n){
        if(n == 1){
            System.out.println("Iniciar Docker");
        } else if(n == 2){
            System.out.println("Parar banco de dados");
        } else if (n == 3) {
            System.out.println("Sair");
        } else {
            System.out.println("Opções Válidas: 1- Iniciar Docker, 2 - Parar Banco de Dados, 3 - Sair");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao Menu de Tarefas");
        System.out.printf("Digite:\n 1 - Iniciar Docker \n 2 - Parar Banco de Dados\n 3 - Sair\n");
        int entrada = input.nextInt();
        menu(entrada);
        
    }
}
