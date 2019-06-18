public class NestedLoop {
    static final int MAX = 9;

    public static void main(String[] args) {
        int row, column, num;

        for (row = 1; row <= MAX; row++) {
            for (column = 1; column <= row; column++) {
                num = row;
                System.out.print(num);
            }
            System.out.println(); //Takes us to the next line
        }
    }
}
