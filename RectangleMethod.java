import java.util.*;
class RectangleMethod {
  static Scanner sc = new Scanner(System.in);
  public static double[] generateX(double a, double b, int size) {
    double step = (a - b) / size;
    double[] x = new double[size];
    System.out.print("x[0] = ");
    x[0] = sc.nextDouble();
    for (int i = 1; i < size; i++) {
      x[i] = x[i - 1] + step;
    }
    return x;
  }
  public static double calc(double[] x) {
    double s = 0;
    for (int i = 0; i < x.length - 1; i++) {
      s += func(x[i]) * (x[i + 1] - x[i]);
    }
    return s;
  }
  public static double func(double x) {
    return Math.cos(x);
  }
  public static void main(String[] args) {
    System.out.print("a = ");
    double a = sc.nextDouble();
    System.out.print("b = ");
    double b = sc.nextDouble();
    System.out.print("Array's size = ");
    int size = sc.nextInt();
    double step = (a - b) / size;
    double[] x = new double[size];
    double s = 0;
    double[] x1 = generateX(a, b, size);
    double sq = calc(x1);
    for (int i = 0; i < x.length; i++) {
      System.out.println("x[" + i + "] = " + x1[i]);
    }
    System.out.println("Square = " + sq);
  }
}
