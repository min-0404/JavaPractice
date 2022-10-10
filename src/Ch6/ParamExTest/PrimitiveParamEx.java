package Ch6.ParamExTest;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);

        change(d.x); // 이런다고 객체 d의 x가 바뀌지 않음
        System.out.println(d.x);
    }
    static void change(int x){
        x = 9999;
        System.out.println(x);
    }
}
