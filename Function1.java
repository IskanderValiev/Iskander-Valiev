import java.util.Scanner;
class Function1 {
  public static int max(int a[]) {
    int max = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    return max;
  }
  public static int min(int a[]) {
    int min = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
      }
    }
    return min;
  }
  public static int sum(int a[]) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    int[] a = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      System.out.print("a[" + i + "] = ");
      a[i] = sc.nextInt();
    }
    System.out.println("Max: " + max(a));
    System.out.println("Min: " + min(a));
    System.out.println("Sum: " + sum(a));
  }
}
