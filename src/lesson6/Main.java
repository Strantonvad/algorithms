package lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int countOfTrees = 20;
        int treeHeight = 6;
        int minLimit = -100 ;
        int maxLimit = 100 ;
        Random rand = new Random();

        List<MyTreeMap<Integer, Integer>> maps = new ArrayList<>();

        for (int i = 1; i <= countOfTrees ; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();

            while (map.height() < treeHeight) {
                map.put(rand.nextInt(maxLimit - minLimit) + minLimit, rand.nextInt(maxLimit));
            }
            maps.add(map);
        }

        for (MyTreeMap<Integer, Integer> map : maps) {
            System.out.println(map);
            if(map.isBalanced(map.getRoot())){
                System.out.println("Tree is balanced");
            } else {
                System.out.println("Tree is not balanced");
            }
        }

        System.out.println(maps);


//        map.put(5,"five");
//        map.put(1,"one");
//        map.put(3,"three");
//        map.put(2,"two");

//        System.out.println(map);
//        System.out.println(map.get(2));
//        map.put(2,"ttt");

//        Object node = map.get(2);
//        System.out.println(node);

//        map.deleteMin();
//        System.out.println(map);

    }
}
