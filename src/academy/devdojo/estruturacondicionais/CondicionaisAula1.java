package academy.devdojo.estruturacondicionais;

public class CondicionaisAula1 {
    public static void main(String[] args) {

        boolean condicao = true;

        if(condicao){
            System.out.println("Dentro do IF");
        }else{
            System.out.println("Dentro do ELSE");
            System.out.println("Dentro do ELSE");
            System.out.println("Dentro do ELSE");
            System.out.println("Dentro do ELSE");

        }
        System.out.println("Fora do IF");
    }

    public static class ImparOuPar {
        public static void main(String[] args) {
            int numero = 12121;
            if( (numero % 2) == 0){
                System.out.println( "par: "+(numero % 2));
            }else{
                System.out.println("impar: "+(numero % 2));
            }
        }
    }
}
