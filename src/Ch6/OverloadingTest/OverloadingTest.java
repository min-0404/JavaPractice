package Ch6.OverloadingTest;

public class OverloadingTest {

    public static void main(String[] args) {
        MyMath3 m = new MyMath3();

        System.out.println(m.add(1,2));

        int[] lst = {100, 200, 300};
        System.out.println(m.add(lst));

    }

}
