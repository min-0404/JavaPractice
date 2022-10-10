package Ch6.ReturnTest;

public class ReferenceReturnTest {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);

        Ch6.ReturnTest.Data d2 = copy(d);
        System.out.println(d2.x);
    }

    static Ch6.ReturnTest.Data copy(Ch6.ReturnTest.Data d){
        Ch6.ReturnTest.Data tmp = new Ch6.ReturnTest.Data();
        tmp.x = d.x;
        return tmp;
    }
}
