package program;

import exception.ParametrosInvalidosExeption;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExeption e){
            System.out.println(e.getMessage());
        }

        scan.close();
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExeption {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosExeption("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }

}
