package Introducao.ArraysMultidimencionais;

public class ArraysMultidimencionais01 {
    static void main(String[] args) {

        int [][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 20;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 20;
        dias[1][2] = 21;

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
    }
}
