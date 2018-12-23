package question3;

import question3.tools.StampToDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream is = System.in;
        String inputstr = null;
        System.out.println("请输入时间戳");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            inputstr = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StampToDate sTD = new StampToDate(Integer.valueOf(inputstr));
        System.out.println("GMT" + sTD.getYear() + "-" + sTD.getMonth() + "-" + sTD.getDay() + " " + sTD.getHour() + ":" + sTD.getMinute() + ":" + sTD.getSecond());
    }
}
