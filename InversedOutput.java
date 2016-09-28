class InversedOutput {
  public static void main(String[] args) {
    int a[] = {3, 6, -10, 9};
    for (int i = 0; i < a.length / 2; i++) {
      int m = a[a.length - i - 1];
     a[a.length - i - 1] = a[i];
     a[i] = m;
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "]= " + a[i]);
    }
  }
}
