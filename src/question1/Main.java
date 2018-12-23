package question1;

import question2.FileUtil;
import question2.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Student[] stus = new Student[18826];
        InputStream is = System.in;
        String inputstr = null;
        Boolean flag = false;
        FileUtil fileUtil = new FileUtil();
        try {
            stus = fileUtil.parseStudents("D:\\codes\\java\\redrock\\students.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("请输入学号：");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            inputstr = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < stus.length; i++) {
            if (inputstr.equals(stus[i].getStuid())) {
                System.out.println(stus[i].getName());
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("该学生不存在");
        }
    }
}
