package Ch6.MyMathTest;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath m = new MyMath();

        long result1 = m.add(5L, 3L);
        long result2 = m.subtract(5L, 3L);
        double result3 = m.divide(5L, 3L); // divide 함수의 매개변수는 double 이지만 long 해도됨
    }
}
