public class Test7 {

    public static void main() {

        // Bubble sorting method:

        int a[] = {4,2,5,1,3};
        int temp;

        for (int i=0; i<5; i++) {

            for (int j=i+1; j<5; j++) {

                if (a[i]>a[j]) {

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }

        for (int i=0; i<5; i++) {

            System.out.println(a[i]);
        }

    }
}
