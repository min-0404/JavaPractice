package Ch6.MyMathTest;

public class MyMathTest2 {
    int add(int x, int y){
        return x + y;
    }
    static int subtract(int x, int y){
        return x- y;
    }

    public static void main(String[] args) {
        MyMathTest2 m = new MyMathTest2();
        int result = m.add(10, 5); // 인스턴스 생성해야 실행 가능
        System.out.println(result);

        int result2 = MyMathTest2.subtract(10, 5); // 인스턴스 없어도 실행 가능
        System.out.println(result2);
    }
}
