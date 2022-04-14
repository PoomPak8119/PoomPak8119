import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib(n)); 

     
    }

    static int Fib(int n){
        if(n == 0 ){
            return 0;
        }
        else if(n == 1){
            return 1;           
        }
        else{
            return Fib(n-1)+Fib(n-2);
        }
    }
}
