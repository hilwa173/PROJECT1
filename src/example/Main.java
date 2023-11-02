package example;

import la5.School;

public class Main {
    static int num = 2;

    long catNum = num;

    double num2 = 2;
    int castNum2 = (int) num2;
    Object obj = new String("hi");
    String string = (String) obj;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        School school =new School();
        school.connMethod();
    }


}