import java.util.Arrays;

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



        System.out.println("-------------------------------");


        // Calculate frequency of array elements:

        int arr[] = {1,3,4,1,1,4,4,1,2};

        Arrays.sort(arr); // arr[]= {1,1,1,1,2,3,4,4,4}

        int count = 1;

        for (int f=1; f<arr.length; f++) {

            if (arr[f]==arr[f-1]) {

                count++;
            }

            else {


                System.out.println(arr[f - 1] + " -> " + count);
                count = 1;

            }
        }


        if (arr.length > 0) {
            System.out.println(arr[arr.length - 1] + " -> " + count);
        }


    }
}
