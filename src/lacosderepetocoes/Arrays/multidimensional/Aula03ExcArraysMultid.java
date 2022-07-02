package lacosderepetocoes.Arrays.multidimensional;

public class Aula03ExcArraysMultid {
    public static void main(String[] args) {
        int [][] arrayMuti1 = new int[3][3];
        arrayMuti1 [0][0] = 22;
        arrayMuti1 [0][1] = 11;
        arrayMuti1 [0][2] = 4;
        arrayMuti1 [1][0] = 44;
        arrayMuti1 [1][1] = 55;
        arrayMuti1 [1][2] = 9;
        arrayMuti1 [2][0] = 2;
        arrayMuti1 [2][1] = 5;
        arrayMuti1 [2][2] = 21;
        int resultMultDiagPrinc = 1;
        for (int i = 0; i < arrayMuti1.length; i++) {
            for (int j = 0; j < arrayMuti1[i].length; j++) {
                if (i==j){
                    resultMultDiagPrinc = resultMultDiagPrinc * arrayMuti1[i][j];
                }

            }

        }
        System.out.println(resultMultDiagPrinc);
    }
}
