public class Print1ToN {
    public static void print(int n,int i){
        
        if(i>n){
            return;
        }
        System.out.println(i);
        print(n,i+1);
    }

    public static void main(String[] args){
        int n=3,i=1;
        print(n,i);
    }
}