package ThiJava;

public class TestCalculating{
    public static void main(String[] args) {
        Calculating bank = new Calculating(1000, 100);
        System.out.println("Monthly interest is : " + bank.calculateInterest());
    }
}
