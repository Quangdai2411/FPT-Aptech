package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Samsung");
        topCompanies.add("Facebook");

        System.out.println("Here are the top " + topCompanies.size());
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(2);
        String lastCompany = topCompanies.get(topCompanies.size() - 2);

        System.out.println("Best Company : " + bestCompany);
        System.out.println("Second Best Company : " + secondBestCompany);
        System.out.println("Last Company in the list : " + lastCompany);

        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list : " + topCompanies);
    }
}
