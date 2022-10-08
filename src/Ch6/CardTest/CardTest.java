package Ch6.CardTest;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "spade";
        c2.number = 4;

        System.out.println(c1.kind + " " + c1.number + " " + c1.width + " " + c1.height);
        System.out.println(c2.kind + " " + c2.number + " " + c2.width + " " + c2.height);

        c1.height = 200;
        System.out.println(c1.height);
        System.out.println(c2.height);

        Card.height = 1000; // static 변수의 특징
        System.out.println(c1.height);
        System.out.println(c2.height);
    }
}
