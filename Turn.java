import java.util.Scanner;
class Turn {
  public static void main(String[] args) {
    int[][] a = new int[3][3];
    Scanner sc = new Scanner(System.in);
    int f = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print("a[" + i + "][" + j + "] = ");
        a[i][j] = sc.nextInt();
        if (i + j >= a.length) {
          f = a[a.length - 1 - i][a.length - 1 - j];
          a[a.length - 1 - i][a.length - 1 - j] = a[i][j];
          a[i][j] = f;
        }
      }
    }
    System.out.println(" ");
    System.out.println("Matrix after changes:");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
      }
    }
  }
}
