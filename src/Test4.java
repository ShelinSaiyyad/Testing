public class Test4 {

    public static void main() {

        //Find minimum number from the matrix/array

        int a[][] = {{2,3,4}, {1,5,3}, {2,0,7}};
        int min = a[0][0];

        for (int i=0; i<3; i++) {

            for (int j=0; j<3; j++) {

                if (a[i][j]<min) {

                    min = a[i][j];
                }

            }
        }

        System.out.println(min);


        System.out.println("-------------------------------");


        //Find maximum number from the matrix/array

        int b[][] = {{2,3,4}, {1,5,3}, {2,0,7}};
        int max = b[0][0];

        for (int k=0; k<3; k++) {

            for (int l=0; l<3; l++) {

                if (b[k][l]>max) {

                    max = b[k][l];
                }
            }

        }

        System.out.println(max);

    }
}