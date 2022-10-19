package Ch6.MemberCallTest;

public class MemberCall {

    int iv = 10;
    static int cv = 20;

    int iv2 = cv; // cv는 클래스 변수라서 객체 생성 안하고 맘대로 호출 가능

    // static int cv2 = iv; 불가
    static int cv2 = new MemberCall().iv; // iv 는 인스턴스 변수라서 객체를 생성해서 호출해야함

    static void staticMethod1(){
        System.out.println(cv);
        //System.out.println(iv); 에러 -> 클래스 매서드에서 인스턴스 변수 사용불가

        // 이렇게 객체 생성한 다음에 사용해줘야함
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2(){

        staticMethod1(); // 클래스 매서드는 언제든지 호출 가능

        // instanceMethod1(); 에러 발생 -> 클래스매서드에선 인스턴스 매서드 호출 불가
        MemberCall c = new MemberCall(); // 이렇게 객체 생성한 다음에 호출해줘야함
        c.instanceMethod1();
    }

    void instanceMethod2(){

        staticMethod1(); // 클래스 매서드는 언제든지 호출 가능
        instanceMethod1(); // 가능 -> 인스턴스 매서드에선 클래스 매서드 호출 가능
    }
}
