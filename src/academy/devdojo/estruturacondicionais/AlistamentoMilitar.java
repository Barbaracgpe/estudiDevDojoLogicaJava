package academy.devdojo.estruturacondicionais;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 18;

        if((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println(" Alistamento não permitido");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento obrigatorio");
        }else if (sexo == 'F' && idade >= 18) {
            System.out.println("deseja ser alistar");
        }
    }
}
