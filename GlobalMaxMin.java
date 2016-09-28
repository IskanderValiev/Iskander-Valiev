import java.util.Scanner; // input Scanner.

class GlobalMaxMin {
  public static void main(String[] args) {
    int[] a = new int[10]; // input array. Array's size = 10.
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt(); // input elements of array.
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " "); // finding elements.
    }
    int min = a[0]; // input max value.
    int max = a[0]; // input min value.
    for (int i = 0; i < a.length; i++) {
     if (a[i] > max) {
       max = a[i];
     }
     if (a[i] < min) {
      min = a[i];
     }
    }
    System.out.println(" ");
    System.out.println("Max value = " + max); // finding max value.
    System.out.println("Min value = " + min); // finding min value.
    int locmax = a[0]; // input local max value.
    int locmin = a[0]; // input local min value.
    for (int i = 1; i < a.length - 1; i++) {
      if ((a[i] > a[i+1]) && (a[i] > a[i-1])) {
        locmax = a[i];
      }
      if ((a[i] < a[i-1]) && (a[i] < a[i+1])) {
        locmin = a[i];
      }
    }
    if (locmax == a[0]) {
      System.out.println("n/a Local Max Value");
    } else {
      System.out.println("Local max value = " + locmax); // finding local max value.
      }
    if (locmin == a[0]) {
      System.out.println("n/a Local Min Value");
    } else {
      System.out.println("Local min value = " + locmin); // finding local min value.
      }
  }
}
