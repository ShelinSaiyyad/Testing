public class Test13 implements Test11, Test12 {

    public static void main(String[] args) {

        //implementation of all the interface methods is compulsory.
        //'implements' keyword is used to access/implement interfaces.

        Test11 t11 = new Test13();  //Initializing class object (this object is referring methods in class- Test11 & Test12)
        t11.GreenGo();
        t11.RedStop();
        t11.YellowBeCareful();

        Test12 t12 = new Test13();
        t12.TrainSymbol();

        Test13 t13 = new Test13();
        t13.WalkOnSymbol();

    }

    @Override
    public void GreenGo() {
        System.out.println("GreenGo Implementation");
    }

    @Override
    public void RedStop() {
        System.out.println("RedStop Implementation");

    }

    @Override
    public void YellowBeCareful() {
        System.out.println("YelloBeCareful Implementation");

    }

    @Override
    public void TrainSymbol() {
        System.out.println("TrainSymbol Implementation");

    }

    public void WalkOnSymbol() {
        System.out.println("WalkOnSymbol Implementation");


    }
}
