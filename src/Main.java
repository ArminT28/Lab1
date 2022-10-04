import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello menut!");

        Scanner scanner= new Scanner(System.in);    //System.in is a standard input stream

        float sum=0;
        int number;
        int count=0;

        while(scanner.hasNextInt())
        {
            number = scanner.nextInt();
            sum = sum + number;
            count++;
        }

        var average = sum/count;

        System.out.println("Media aritmetica=" + average);
    }
}