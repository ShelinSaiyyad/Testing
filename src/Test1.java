import java.util.concurrent.ForkJoinPool;

public class Test1 {

    static void main(String[] args) {

        // Example on pyramid Triangle

        int k=1;
        for (int i=0; i<4; i++) {
            //System.out.println("outer loop start");

            for (int j=1; j<=4-i; j++) {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println("");
        }
    }
}
