import java.util.Scanner;
class FunctionMult {
  public static int[][] mult(int[][] a, int[][] b) {
    int m = a.length;
    int n = b.length;
    int p = b[0].length;
    int[][] res = new int[m][p];
    for (int i = 0 ; i < m; i++) {
      for (int j = 0; j < p; j++) {
      int mult = 0;
        for (int k = 0; k < n; k++) {
          mult = mult + a[i][k] * b[k][j];
        }
        res[i][j] = mult;
      }
    }
    return mult;
  }
  public static void main(String[] args) {
    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    int[][] res = new int[a.length][b[0].length];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print("a[" + i + "][" + j + "] = ");
        a[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b.length; j++) {
        System.out.print("b[" + i + "][" + j + "] = ");
        b[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b.length; j++) {
        System.out.println("Result = " + res[i][j]);
      }
    }
  }
}
