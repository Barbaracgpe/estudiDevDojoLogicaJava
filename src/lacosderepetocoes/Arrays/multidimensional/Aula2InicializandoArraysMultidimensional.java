package lacosderepetocoes.Arrays.multidimensional;

import java.util.Scanner;

public class Aula2InicializandoArraysMultidimensional {
    public static void main(String[] args) {
        int [][] arrayMuti1 = new int[2][3];
        arrayMuti1 [0][0] = 22;
        arrayMuti1 [0][1] = 11;
        arrayMuti1 [0][2] = 54;
        arrayMuti1 [1][0] = 44;
        arrayMuti1 [1][1] = 56;
        arrayMuti1 [1][2] = 76;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayMuti1.length; i++) {
            for (int j = 0; j < arrayMuti1[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "] [" + j + "]");
                arrayMuti1[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i < arrayMuti1.length; i++) {
            for (int j = 0; j < arrayMuti1[i].length; j++) {
                System.out.println("["+i+"] ["+j+"] = "+arrayMuti1[i][j]);
            }

        }
    }
}
