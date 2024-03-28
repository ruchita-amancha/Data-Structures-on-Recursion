import java.util.Scanner;

public class PrintNameNtimes{

    public static void printName(int n){

        if(n<=0){
            return;
        }
        System.out.println("Ruchita");
        printName(n-1);
    }

    // User-Defined N

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        printName(n);
    }

    // Pre-Defined n

    // public static void main(String[] args) {
    //     int n=10;
    //     printName(n);
    // }
}
