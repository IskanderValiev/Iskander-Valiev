import java.util.Scanner;
class FunctionBubble {
  public static void bubble(int[] a) {
    for (int i = a.length - 1; i >= 0; i--) {
      for (int j = 0; j < a.length - 1; j++) {
        if (a[j] > a[j + 1]) {
          int x = a[j];
          a[j] = a[j + 1];
          a[j + 1] = x;
        }
      }
    }
  }
  public static void main(String[] args) {
    int[] a = new int[7];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      System.out.print("a[" + i + "] = ");
      a[i] = sc.nextInt();
    }
    bubble(a);
    System.out.println("Result: ");
    for (int i = 0; i < b.length; i++) {
      System.out.println("a[" + i + "] = " + b[i]);
    }
  }
}
