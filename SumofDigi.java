import java.util.Scanner;

public class SumofDigi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOf(n));
    }
    static int sumOf(int n){
        if(n==0) {
            return 0;
        }
        return (n%10)+sumOf(n/10);
    }
}
