public class Test3 {
    public static void main(String[] args) {

        //Single D Array
  /*    int a[] = new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5; */

        int a[] = {1, 2, 3, 4,5};

        for (int i=0; i<a.length; i++) {

            System.out.println(a[i]);
        }

        System.out.println("-------------------------------");

        //Multi D Array
  /*    int b[][] = new int[2][3];
        b[0][0]=1;
        b[0][1]=2;
        b[0][2]=3;
        b[1][0]=4;
        b[1][1]=5;
        b[1][2]=6; */

        int b[][] = {{1,49,3},{4,5,15}};

        for (int r=0; r<2; r++) {  //r-rows-outer loop

            for (int c=0; c<3; c++) {  //c-columns-inner loop

                System.out.println(b[r][c]);

            }
        }

        System.out.println("-------------------------------");

        int abc[][] = {{2,4,5}, {3,4,7}, {1,2,9}};

        System.out.println(abc[2][0]);

    }
}
