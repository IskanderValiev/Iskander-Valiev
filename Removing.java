import java.util.Scanner;
import java.util.Random;
class Removing {
  public static void main(String[] args) {
    int[] a = new int[5]; // вводим массив
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    System.out.println("Enter elements of array: ");
    for (int i = 0; i < a.length; i++) {
      a[i] = r.nextInt(); // вводим элементы массива
      System.out.print(a[i] + " ");
    }
    int[] c = new int[a.length]; // вводим 2й массив
    System.out.println("enter the element for delete: ");
    int n  = sc.nextInt(); // вводим индекс элемента, который хотим удалить
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      if (i != n) {
        c[j] = a[i];
        j++;
      }
    }
    System.out.println("Array : ");
    for (int i = 0; i < j; i++) {
      System.out.println(c[i]);
    }
  }
}
