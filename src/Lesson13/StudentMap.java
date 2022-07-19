package Lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Student student1 = new Student("Vanya", 9.500f);
        Student student2 = new Student("Linkevich", 8.00f);
        Student student3 = new Student("Vitya", 7.00f);
        Student student4 = new Student("Lena", 2.50f);
        Student student5 = new Student("Vika", 6.00f);
        Student student6 = new Student("Valya", 3.04f);

        List<Student> studentList = new ArrayList<>();
        studentList.add(0,student1);
        studentList.add(1,student2);
        studentList.add(2,student3);
        studentList.add(3,student4);
        studentList.add(4,student5);
        studentList.add(5,student6);

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMark() < 4f) { // по индексу вызвали студента и запросили у него оценку.
                studentList.remove(studentList.get(i));
                i--;
            }
        }
        System.out.println(studentList);
        //------------------------------------

        Map<String, String> map = new HashMap<>();
        map.put("1", "Moskvich");
        map.put("2", "Volvo");
        map.put("3", "Citroen");
        map.put("4", "VAZ");
        map.put("5", "MAZ");
        map.put("6", "BelAZ");
        String key = "";
        String value = "";

        Map<String, String> mapSecond = new HashMap<>();

        for (Map.Entry<String, String> simba : map.entrySet()) {
            key = simba.getKey();
            value = simba.getValue();
            mapSecond.put(value, key);
        }
        System.out.println(mapSecond);
        //----------------------------------------

        List<Integer> listValue = new ArrayList<>();
        listValue.add(1);
        listValue.add(2);
        listValue.add(3);
        listValue.add(4);
        listValue.add(5);
        listValue.add(4);
        listValue.add(3);
        listValue.add(2);
        listValue.add(1);
        Map<Integer, Integer> mapSecond123 = new HashMap<>();

        for (Integer l : listValue) {
            if (mapSecond123.containsKey(l)) {
                // get(key) получаем значение по ключу.
                mapSecond123.put(l, mapSecond123.get(l) + 1);
            } else {
                mapSecond123.put(l, 1);
            }
        }
        for(Map.Entry<Integer, Integer> duplicate : mapSecond123.entrySet()) {
            if (duplicate.getValue() == 1) {
                System.out.println(duplicate.getKey() + " Net dublicata");
            }
        }
    }
}
