import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int max;
        System.out.println("입력받은 두수를 입력하세요");
        int num=scanner.nextInt();
        System.out.println("입력1:");
        int num2=scanner.nextInt();
        System.out.println("입력2:");


        max=(num>num2)? num:num2;

        System.out.println(max);


    }
}
