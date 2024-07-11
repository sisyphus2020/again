package ch01.ex05local;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        int kor1 = 0;
        int kor2 = 0;
        int kor3 = 0;

        // 성적 로드
        {
            FileInputStream fis = new FileInputStream("res/kors.txt");
            Scanner scan = new Scanner(fis);

            kor1 = scan.nextInt();
            kor2 = scan.nextInt();
            kor3 = scan.nextInt();
            kor1++;
            scan.close();
            fis.close();
        }

        // 성적 입력
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("kor1 : ");
            kor1 = scan.nextInt();
            System.out.print("kor2 : ");
            kor2 = scan.nextInt();
            System.out.print("kor3 : ");
            kor3 = scan.nextInt();

            scan.close();
        }

        // 성적 저장
        {
            FileOutputStream fos = new FileOutputStream("res/kors.txt");
            PrintStream out = new PrintStream(fos);

            out.print(kor1);
            out.print(" ");
            out.print(kor2);
            out.print(" ");
            out.print(kor3);
            out.print(" ");

            out.close();
            fos.close();
        }

        // 성적 출력
        {
            int total = kor1 + kor2 + kor3;
            float avg = total / 3.0f;
            // 한영 ㅂ > 한자
            System.out.print("┌───────────────────────────┐\n");
            System.out.print("│         성적   출력       │\n");
            System.out.print("└───────────────────────────┘\n");

            System.out.printf("kor1 : %3d\n", kor1);
            System.out.printf("kor2 : %3d\n", kor2);
            System.out.printf("kor3 : %3d\n", kor3);
            System.out.printf("total : %3d\n", total);
            System.out.printf("avg : %6.3f\n", avg);
        }

    }
}
