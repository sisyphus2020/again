package ch01.ex03print;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws IOException {
        int kor1 = 80;
        int kor2 = 90;
        int kor3 = 100;

        FileOutputStream fos = new FileOutputStream("res/kors.txt");
        PrintStream out = new PrintStream(fos);
        
        out.print(kor1);
        out.print(" ");
        out.print(kor2);
        out.print(" ");
        out.print(kor3);
        out.print(" ");

        int total = kor1+kor2+kor3;
        float avg = total/3.0f;
        // 한영 ㅂ > 한자
        System.out.print("┌───────────────────────────┐\n");
        System.out.print("│         성적   출력        │\n");
        System.out.print("└───────────────────────────┘\n");

        System.out.printf("kor1 : %3d\n", kor1);
        System.out.printf("kor2 : %3d\n", kor2);
        System.out.printf("kor3 : %3d\n", kor3);
        System.out.printf("total : %3d\n", total);
        System.out.printf("avg : %6.3f\n", avg);
        
        out.close();
        fos.close();
        
    }
}
