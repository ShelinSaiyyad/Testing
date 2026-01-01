public class Test8 {

    public static void main() {

        //  String: It is a predefined Class in java.

        String a = "Hello"; //String Literal

        String b = new String("Hello"); //By creating object of string class

        //  Important methods present in string Class:

        String s = new String(" JavaTraining");

        System.out.println(s.charAt(3));
        System.out.println(s.indexOf("v"));
        System.out.println(s.indexOf("S"));
        System.out.println(s.substring(5));
        System.out.println(s.substring(5, 10));
        System.out.println(s.concat(" Classes"));
        System.out.println(s.trim());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace("T", "S"));

        String arr[] = s.split("T"); //splitted String should be stored in an array
        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }
}
