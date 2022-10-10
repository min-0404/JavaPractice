package Ch6.ReturnTest;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(1, 2);
        System.out.println(result);

        int[] result2 = {0};
        r.add(1, 2, result2);
        System.out.println(result2[0]);
    }
    int add(int x, int y){
        return x + y;
    }
    void add(int x, int y, int[] arr){
        arr[0] = x + y;
    }
}
