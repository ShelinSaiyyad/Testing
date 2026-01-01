public class Test10 {
    public static void main() {

        // String is immutable but by using following code it can be made mutable:
        String a = "hello"; //only 1 object will be created in memory bcoz content is same
        String b = "hello";
        String c = a.concat("world"); //By storing in different String altered/appended String can be used
        System.out.println(c);

        String s = new String("hello"); //object will be created for each string in memory even content is same
        String s1 = new String("hello");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.concat("world"));


        // equals( )- operator checks/matches content of String
        System.out.println(a.equals(b));
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1)); //this operator also checks for upper/lower cases

        // ==- operator checks/matches reference of String
        System.out.println(a==b);
        System.out.println(s==s1);
        System.out.println(s==a);

        System.out.println("-------------------------------");


        // StringBuffer and StringBuilder Classes
        // Bsically these two classes are used to make String mutable and there are some predefined methods which makes working with Strings easy

        // StringBuffer Class
        StringBuffer sb = new StringBuffer("hello");
        sb.append("myworld");
        System.out.println(sb);

        sb.insert(2, "she");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.replace(5, 7, "aa");
        System.out.println(sb);

        sb.deleteCharAt(14);
        System.out.println(sb);

        System.out.println("-------------------------------");

        // StringBuilder is not thread safe, it is non Synchronized and it is faster!

        // StringBuilder Class
        StringBuilder sbl = new StringBuilder("hello");
        sbl.append("myworld");
        System.out.println(sbl);

        sbl.insert(2, "she");
        System.out.println(sbl);

        sbl.reverse();
        System.out.println(sbl);

        sbl.replace(8, 10, "bb");
        System.out.println(sbl);

        sbl.deleteCharAt(14);
        System.out.println(sbl);

    }
}