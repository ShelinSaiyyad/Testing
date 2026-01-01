public class Test9 {

    public static void main(String[] args) {

        String s = "rahul";
        String t = ""; //dummy string
        for (int i=s.length()-1; i>=0; i--) {

            t = t + s.charAt(i);
        }

        System.out.println(t);

        if(s.equals(t)) {  //String comparison uses .equals()

            System.out.println("Palindrome");

        }

        else {

            System.out.println("Not Palindrome");

        }

    }
}
