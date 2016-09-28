import java.util.Scanner;
class Multiplication {
  public static void main(String[] args) {
    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    int[][] res = new int[a.length][b[0].length];
    Scanner sc = new Scanner(System.in);
    Scanner cs = new Scanner(System.in);
    System.out.println("Elements of 'A' array: ");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print("a[" + i + "][" + j + "] = ");
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("Elements of 'B' array: ");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print("b[" + i + "][" + j + "] = ");
        b[i][j] = cs.nextInt();
      }
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b[0].length; j++) {
        for (int k = 0; k < b.length; k++) {
         res[i][j] += a[i][k] * b[k][i];
        }
      }
    }
    System.out.println("Multiplication of matrix: ");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < res[0].length; j++) {
        System.out.println("res[" + i + "][" + j + "] = " + res[i][j]);
      }
    }
  }
}
