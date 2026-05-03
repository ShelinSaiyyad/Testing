import java.sql.SQLOutput;

public class Test14 {

    public static void main(String[] args) {

        int a[] = {4,3,5,2,1};

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < 5; j++) {

                if (a[i] > a[j]) {

                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];

                }

                }

            }

        for (int i = 0; i < 5; i++) {

            System.out.print(a[i] + "\t");
        }


    }


    }

