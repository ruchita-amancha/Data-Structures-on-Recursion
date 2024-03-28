public class Sum_of_1st_N_Numbers {
    static int sum=0;
    public static int sum(int number){
        
       if(number<=0){
        return sum;
       }
       sum=number+sum(number-1);
       return sum;
    }

    public static void main(String args[]){
        int n=3;
        int sum_of_1st_N_Numbers=sum(n);
        System.out.println(sum_of_1st_N_Numbers);
    }
}
