package Lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWorkStream {
    public static void main(String[] args) {

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(0, 3);
        listInteger.add(1, 5);
        listInteger.add(2, 123);
        listInteger.add(3, 3);
        listInteger.add(4, 3);
        listInteger.add(5, 4);
        System.out.println(listInteger);

        List<Integer> filterListInteger = listInteger.stream()
                .distinct()
                .collect(Collectors.toList());
        //------------------
        System.out.println(filterListInteger.stream()
                .filter(number -> number > 7 && number <= 17 && number % 2 == 0).collect(Collectors.toList()));
        //------------------
        System.out.println(filterListInteger.stream().
                map(s -> s * 2).collect(Collectors.toList()));
        //------------------
        System.out.println(filterListInteger.stream()
                        .sorted().limit(4).collect(Collectors.toList())); // метод коллект собирает
        //-------------------
        System.out.println(filterListInteger.stream().count());
        //-------------------
        // double b = (filterListInteger.stream().reduce(0, (sum, number) -> (sum + number)) / filterListInteger.size());
        double c = filterListInteger.stream().reduce(0, (sum, number) -> (sum + number));
        double b = c / filterListInteger.size();
        System.out.println(b);

        //2.
        List<String> students = new ArrayList<>();
        students.add("Ivan");
        students.add("Jora");
        students.add("Vanya");
        students.add("Olya");
        students.add("Olya");
        students.add("Ivan");
        students.add("Vera");




    }
}
