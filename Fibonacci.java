import java.util.*;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }
    static int fib(int n){

        //base condition
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}