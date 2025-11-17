public class GitMiniProject{
public static int[][] createSquareArray(int size) {
        Random rand = new Random();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = rand.nextInt(10) + 1; 
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] result = createSquareArray(5);

        for (int[] row : result) {
            for (int num : row) 
    }
}
