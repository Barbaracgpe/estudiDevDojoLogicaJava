package academy.devdojo.estruturacondicionais;

public class DiasDaSemana {
    public static void main(String[] args) {
        int dia = 8;
        switch (dia) {
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
            case 3:
                System.out.println("quarta");
            case 4:
                System.out.println("quinta");
            default:
                System.out.println("Dia invalido");
        }
    }
}
