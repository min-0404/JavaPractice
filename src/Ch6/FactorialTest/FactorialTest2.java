package Ch6.FactorialTest;

public class FactorialTest2 {
    public static void main(String[] args) {
        long result = factorial(21);
        System.out.println(result);

        long result2 = factorial(5);
        System.out.println(result2);
    }
    static long factorial(int n){
        if(n < 0 || n >= 20){ // 유효성 검사
            return -1;
        }
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
