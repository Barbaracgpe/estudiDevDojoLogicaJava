package academy.devdojo.estruturacondicionais;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();

        if(nome.equals("admin")  || nome.equals("administrador")){
            System.out.println("Usuario invalido");
        }else {
            System.out.println(nome + " cadastrado com sucesso ");
        }
    }
}
