public class PrintNTo1 {
    public static void print(int number){
        if(number<=0){
            return;
        }
        System.out.println(number);
        print(number-1);
    }

    public static void main(String args[]){
        int n=3;
        print(n);
    }
}
