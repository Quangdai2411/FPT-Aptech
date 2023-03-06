package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<String> game = new ArrayList<>();
        System.out.println("Danh sách game có trống không? :" + game.isEmpty());
        game.add("Liên Quân Mobile");
        game.add("PUBG");
        game.add("Liên Minh Huyền Thoại");
        game.add("CS:GO");
        game.add("eFootball");
        System.out.println(game);

        String top1 = game.get(2);
        String top2 = game.get(3);
        String top3 = game.get(0);

        System.out.println("Game top 1 :" + top1);
        System.out.println("Game top 2 :" + top2);
        System.out.println("Game top 3 :" + top3);

        game.set(3,"VALORANT");
        System.out.println(game);
    }
}
