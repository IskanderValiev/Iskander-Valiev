import java.util.Scanner;
class PrimeComposite {
  public static void main(String[] args) {
    int[][] a = new int[5];
    Scanner sc = new Scanner(System.in);
    boolean b = true;
    for (int i = 0; i < a.length; i++) {
      System.out.print("a[" + i + "] = ");
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] > 0 && a[i] <= 3) {
      } else {
        for (int j = 2; j*j <= a[i]; j++) {
          b = true;
          if (a[i] % j == 0) {
            b = false;
          }
          break;
        }
      }
      if (b == false) {
          System.out.println(a[i] + " - Число не простое");
      }
      if (b == true) {
        System.out.println("Индекс простого числа: " + i);
      }
    }
  }
}
