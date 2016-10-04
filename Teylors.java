import java.util.Scanner;
class Teylors {
  public static double sinTeylor(double x, double eps) {
    double a0 = x;
    int n = 1;
    double p = - (Math.pow(x, 2) / (4 * Math.pow(n, 2) + 2 * n));
    double a1 = a0 * p;
    double sin = 0;
    while (Math.abs(a0 - a1) > eps) {
      n++;
      p = - (Math.pow(x, 2) / (4 * Math.pow(n, 2) + 2 * n));
      sin += a0 + a1;
      a0 = a1;
      a1 = a0 * p;
    }
    return sin;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("x = ");
    double x = sc.nextDouble();
    System.out.print("eps = ");
    double eps = sc.nextDouble();
    double sinus = sinTeylor(x, eps);
    System.out.println("Sin = " + sinus);
  }
}
