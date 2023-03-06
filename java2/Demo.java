package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> product = new ArrayList<>();
        product.add("Quạt");
        product.add("Ghế");
        product.add("Bàn");
        product.add("Tivi");
        product.add("Giường");
        System.out.println(product);
        product.add(2,"Bảng");
        System.out.println(product);
    }
}
