package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class CreatArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(4);
        firstFivePrimeNumbers.add(1);
        firstFivePrimeNumbers.add(1);
        firstFivePrimeNumbers.add(3);

        List<Integer> firstTenNumberNumber = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();

        nextFivePrimeNumbers.add(12);
        nextFivePrimeNumbers.add(10);
        nextFivePrimeNumbers.add(20);
        nextFivePrimeNumbers.add(3);
        nextFivePrimeNumbers.add(18);

        firstFivePrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstFivePrimeNumbers);
    }

}
