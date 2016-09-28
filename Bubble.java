import java.util.Scanner; // input scanner
class Bubble {
  public static void main(String[] args) {
    int[] a = {2, -10, 24, 15, -9}; // input array
    /*int m;
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }*/
    for (int i = a.length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (a[j] > a[j+1]) {
          int m = a[j];
          a[j] = a[j + 1];
          a[j+1] = m;
        }
      }
    }
    System.out.println(" ");
    System.out.println("Array: ");
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
