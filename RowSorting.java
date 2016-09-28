import java.util.*;
class RowSorting {
  public static void main(String[] args) {
    int[][] a = new int[3][3];
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print("a[" + i + "][" + j + "] = ");
        a[i][j] = sc.nextInt();
      }
    }
    for (int i = a.length - 1; i >= 0; i--) {
      for (int j = 0; j < a.length - 1; j++) {
        if (a[i][j] > a[i][j + 1]) {
          int x = a[i][j];
          a[i][j] = a[i][j + 1];
          a[i][j + 1] = x;
        }
      }
    }
    System.out.println("Sorted Matrix: ");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
      }
    }
  }
}
