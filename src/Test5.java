public class Test5 {

    public static void main() {

        //Find the minimum number and in the same column find maximum number
        int a[][] = {{1,3,5}, {7,0,11}, {4,9,8}};
        int min = a[0][0];
        int mincolumn=0;

        for (int i=0; i<3; i++) {

            for (int j=0; j<3; j++) {

                if (a[i][j]<min) {

                    min = a[i][j];
                    mincolumn = j;
                }
            }
        }
        System.out.println(min);
        System.out.println(mincolumn);

        int max = a[0][mincolumn];

        int k=0;

        while (k<3) {

            if (a[k][mincolumn]>max) {

                max = a[k][mincolumn];
            }

            k++;
        }

        System.out.println(max);
    }
}
