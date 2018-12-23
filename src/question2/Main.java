package question2;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        Student[] stus = new Student[18826];
        List<Student> repeatList = new ArrayList<Student>();
        String name = null;
        int finalCount = 0;
        try {
            stus = fileUtil.parseStudents("D:\\codes\\java\\redrock\\students.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student> students = new ArrayList<Student>(Arrays.asList(stus));
        Map<String, Integer> map = new HashMap<>();
        for (Student s : students) {
            if (map.containsKey(s.getName())) {
                repeatList.add(s);
                Integer num = map.get(s.getName());
                map.put(s.getName(), num + 1);
            } else {
                map.put(s.getName(), 1);
            }
            Integer count = map.get(s.getName());
            if (count == null) {
                map.put(s.getName(), 1);
            } else {
                map.put(s.getName(), (count + 1));
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > finalCount) {
                name = entry.getKey();
                finalCount = entry.getValue();
            }
        }
        System.out.println("姓名:" + name + "     次数:" + finalCount);
    }
}
