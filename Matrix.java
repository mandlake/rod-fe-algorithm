public class Matrix {
    public static void main(String[] args) {
        int num = 9;
        int[][] matrix = new int[num][num];

        for (int j = 0; j < matrix.length; j++) {
            for(int i = 1; i < matrix.length; i++) {
                System.out.print((j + 1) + " * " + (i + 1) + " = ");
                System.out.printf("%2d    ", ((i + 1) * (j + 1)));
            }
            System.out.print("\n");
        }
    }
}
