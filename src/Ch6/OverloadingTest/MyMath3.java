package Ch6.OverloadingTest;

public class MyMath3 {

    int add(int a, int b){
        return a + b;
    }

    int add(int[] a){
        int result = 0;
        for (int j : a) {
            result += j;
        }
        return result;
    }
}
