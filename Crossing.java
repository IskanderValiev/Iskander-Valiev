import java.util.Scanner;
class Crossing {
  public static void main(String[] args) {
    int[] a = new int[5];
    int[] b = new int[5];
    int p = 0;
    Scanner sc = new Scanner(System.in);
    Scanner cs = new Scanner(System.in);
    System.out.println("Enter aArray: ");
    for (int i = 0; i < a.length; i++) {
    System.out.println("a[" + i + "]" +  " = ");
      a[i] = sc.nextInt();
    }
    System.out.println("Enter bArray");
    for (int i = 0; i < b.length; i++) {
    System.out.println("b[" + i + "]" +  " = ");
      b[i] = cs.nextInt();
    }
    System.out.println("Пересечения: ");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          p++;
          System.out.println(b[j]);
        }
      }
    }
        if (p == 0) {
          System.out.println("Пересечений нет");
      }
    }
  }
