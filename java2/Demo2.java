package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Gấu");
        animals.add("Mèo");
        animals.add("Chó");
        animals.add("Chuột");
        System.out.println(animals);

        List<String> tenAnimal = new ArrayList<>(animals);

        List<String> animalss = new ArrayList<>();
        animalss.add("Rắn");
        animalss.add("Cá sấu");
        animalss.add("Chim");

        tenAnimal.addAll(animalss);
        System.out.println(tenAnimal);
    }
}
