package lacosderepetocoes.fors;

public class Aula03ExcForAninhado {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Fazendo tabuada do nuumero: "+i);
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + "x" + j + " = "+(i*j));

            }
        }
    }
}
