package Ch6.ParamExTest;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);

        change(d);
        System.out.println(d.x); // 제대로 바뀜

    }
    static void change(Data d){ // 참조변수를 파라미터로 받아줌 -> 실제 객체에 접근 가능
        d.x = 999;
        System.out.println(d.x);
    }
}
