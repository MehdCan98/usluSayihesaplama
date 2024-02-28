import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k, n;
        int total = 1;

        System.out.println("1 değer");
        k = input.nextInt();

        System.out.println("1 değer");
        n = input.nextInt();


        for (;n !=0; --n ){
            total *=k;
        }
        System.out.println(total);
    }
}