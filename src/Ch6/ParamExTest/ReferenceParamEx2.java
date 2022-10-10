package Ch6.ParamExTest;

public class ReferenceParamEx2 {
    public static void main(String[] args) {

        int[] arr = {10};
        System.out.println(arr[0]);

        change(arr);
        System.out.println(arr[0]);

    }
    static void change(int[] x){
        x[0] = 100;
        System.out.println(x[0]);
    }

}

