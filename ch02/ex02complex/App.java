package ch02.ex02complex;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별(남자:1, 여자:2) : ");
        int x = scan.nextInt();
        String gender = (x ==1 ? "남성":"여성");

        System.out.printf("당신의 성별은 %s이군요", gender);
    }
}
