import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;


public class Pi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("eps = ");
    double eps = sc.nextDouble();
    double p = calcPi1(eps);
    writeToFile(eps);
    System.out.println("calcPi1 = " + (2 * p));
    System.out.println("calcPi2 = " + (2 * Math.pow(3, 0.5) * calcPi2(eps)));
    System.out.println("calcPi3 = " + (8 * calcPi3(eps) + Math.log10(2)));
    }

    public static double calcPi1(double eps) {
      int k = 1;
      double pi = 2 * (4.0 / 3);
      while (Math.abs(pi - Math.PI) > eps) {
        pi = 2 * pi * (4.0 * k*k) / (4.0 * k*k - 1.0);
        System.out.println(pi);
        k++;
      }
      return pi;
    }

    public static double calcPi2(double eps) {
      int k = 0;
      double pi = (Math.pow(-1, k)) / (Math.pow(3, k) * (2 * k + 1));
      while (Math.abs(pi - Math.PI) < eps) {
        k++;
        pi = pi + (Math.pow(-1.0, k)) / (Math.pow(3, k) * (2.0 * k + 1.0));
      }
      return pi;
    }

    public static double calcPi3(double eps) {
      int k = 1;
      double pi = 1 / (16 * Math.pow(k, 2) - 12 * k + 2);
      while (Math.abs(pi - Math.PI) < eps) {
        k++;
        pi = pi + 1 / (16 * Math.pow(k, 2) - 12 * k + 2.0);
      }
      return pi;
    }

    public static void writeToFile(double eps) {
            File myFile = new File("pi.txt");
      try {
        // FileWriter file = new FileWriter(myFile);
            BufferedWriter file = new BufferedWriter(new FileWriter(myFile)); //use BufferedWriter to compile programm faster
            file.flush(); //clear buffer
            file.write("calcPi1 = " + calcPi1(eps) + ",\n" + "calcPi2 = " + calcPi2(eps) + ", \n" + "calcPi3 = " + calcPi3(eps));
            file.close(); //close stream
      }catch (IOException ex) {
        ex.printStackTrace();
      }
    }
}
