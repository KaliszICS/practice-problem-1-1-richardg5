public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int e = 0; e < arr[i].length; e++) {
				sum += arr[i][e];
			}
		}
		return sum;
	}

	public static int sumRow(int[][] arr, int row) {
		int sum = 0;
		for (int i = 0; i < arr[row].length; i++) {
			sum += arr[row][i];
		}
		return sum;
	}

	public static int sumColumn(int[][] arr, int col) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][col];
		}
		return sum;
	}
}
