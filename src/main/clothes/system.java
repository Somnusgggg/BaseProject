package clothes;

import java.util.Scanner;

public class system {

  public static void choose() {

    String[] s = new String[100];
    String[] p = new String[100];
    int i = 0, j = 0;
    int n = 0;
    Scanner d = new Scanner(System.in);
    boolean done = false;

    while (!done) {
      System.out.println("�O�_�[�J�A��: 1.�O 2.�_");
     
        n = d.nextInt();

      if (n == 2) {
        done = true;
      } else if (n == 1) {

        Scanner shi = new Scanner(System.in);
        Scanner pan = new Scanner(System.in);

        System.out.println("�п�J�W��:");
        s[i] = shi.next();
        System.out.println("�п�J�Ǥl");
        p[i] = pan.next();

        i++;

        done = false;
      } else {
        System.out.println("�Х��T��J");
      }

    }

    java.util.Random r = new java.util.Random();
    java.util.Random ra = new java.util.Random();

    for (j = 0; j < i; j++) {

      int r1 = r.nextInt(i);
      int r2 = ra.nextInt(i);
      
       System.out.println("��A:" + s[r1]);
       System.out.println("�Ǥl:" + p[r2]);
     }
    

    if (j == 0) {
      System.out.println("����J������");
    }

  }

}