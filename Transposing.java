import java.util.Scanner;
class Transposing {
  public static void main(String[] args) {
    int[][] a = new int[3][4];
    int[][] b = new int[4][3];
    Scanner sc = new Scanner(System.in);
    int i,j;
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a.length; j++) {
        System.out.print("a[" + i + "][" + j + "] = ");
        a[i][j] = sc.nextInt();
        }
      }
      for (i = 0; i < a.length; i++) {
        for (j = 0; j < a.length; j++) {
          b[i][j] = a[j][i];
        }
      }
    System.out.println("Matrix after changes: ");
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a.length; j++) {
        System.out.println("a[" + i + "][" + j + "] = " + b[i][j]);
      }
    }
  }
}
