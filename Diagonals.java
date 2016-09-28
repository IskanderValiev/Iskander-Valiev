import java.util.Scanner;
class Diagonals {
  public static void main(String[] args) {
    int[][] a = new int[3][3];
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int sum1 = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print("a[" + i + "][" + j + "] = ");
        a[i][j] = sc.nextInt();
        if (i == j) {
          sum = sum + a[i][j];
        }
      }
      for (int j = a.length - 1; j >= 0; j--) {
          if (i + j == a.length - 1) {
            sum1 = sum1 + a[i][j];
          }
      }
    }
    System.out.println("the sum of elements of secondary diagonal = " + sum1);
    System.out.println("the sum of elements of main diagonal = " + sum);
  }
}
