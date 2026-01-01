public class Test6 {

    public static void main(String[] args) {

        //Swapping two ints

        int a = 4;
        int b = 5;

        //Using 3rd variable:
/*     int temp;

       temp = a;
       a = b;
       b = temp;

       System.out.println(a);
       System.out.println(b); */


        //Not using 3rd variable:

        a = a+b; //a=4+5=9
        b = a-b; //b=9-5=4
        a = a-b; //a=9-4=5

        System.out.println(a);
        System.out.println(b);

    }
}