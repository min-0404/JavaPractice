package CodingTest;
import java.util.*; // 유틸 라이브러리


public class Grammar {

    public static void main(String[] args) {

        // 1. 변수 및 배열 선언
        String[] arr1 = new String[5]; // 단순한 배열 활용하기
        for(String s : arr1){
            System.out.println(s);
        }

        List arr2 = new ArrayList(10); // List 컬렉션 사용하기: 타입 지정 안한 경우
        arr2.add("minseok");
        System.out.println(arr2.get(0));

        List<String> arr3 = new ArrayList<String>(10); // List 컬렉션 사용하기: 구체적으로 타입 지정 가능
        arr3.add("kim");
        System.out.println(arr3.get(0)); // Collections 프레임워크는 인덱스로 접근 할때도 꼭 함수 사용

        ArrayList<String> arr4 = new ArrayList<>(1); // ArrayList 는 결국 List 를 상속받은 것임, 자유롭게 코딩
        arr4.add("finn");
        for(int i = 0 ; i < arr4.size(); i++){
            System.out.println(arr4.get(i));
        }

        int x = 10;
        int[] arr5 = new int[x];
        for(int i = 0; i < arr5.length; i++){ // List 컬렉션은 size()함수로 길이 알아내고, 단순 배열은 lenght 사용 가능
            System.out.println(i);
        }

        // 2. Arrays(단순 배열) 다루기
        int[] arr6 = {10, 8, 11, 2, 3, 0};
        Arrays.sort(arr6); // 오름차순
        for(int i : arr6){
            System.out.print(i + " ");
        }
        System.out.println();


        Integer[] arr7 = {10, 8, 11, 2, 3, 0};
        Arrays.sort(arr7, Collections.reverseOrder());
        // Collections.reverseOrder()는 사실 Comparator 라는 객체를 사용해 구현된 것인데,
        // Comparator 쓰면 int 말고 Integer 대상으로만 사용가능하니 주의할 것
        // 즉, 내림차순은 무조건 Integer 대상으로만 가능
        System.out.print(Arrays.toString(arr7));
        System.out.println();

        Arrays.sort(arr7, (i1, i2) -> i2 - i1 ); // 내림차순을 람다로 구현해봄

        int[] arr8 = {10, 8, 11, 2, 3, 0};
        Arrays.sort(arr8, 0, 4); // 부분 정렬
        for(int i : arr8){
            System.out.print(i + " ");
        }
        System.out.println();


        // 1. String 배열을 길이 순서대로 정렬: 정석대로 Comparator로 구현
        String[] strArr1 = {"apple", "banana", "cat"};
        Arrays.sort(strArr1, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.print(Arrays.toString(strArr1));
        System.out.println();

        // 2. String 배열을 길이 순서대로 정렬: 람다로 구현
        String[] strArr2 = {"apple", "banana", "cat"};
        Arrays.sort(strArr2, (s1,s2) -> s1.length() - s2.length());

        System.out.println(Arrays.toString(strArr2));
        System.out.println();

        // 번외: 객체 배열을 정렬해보기
        class Fruit implements Comparable<Fruit>{
            private String name;

        }











        // arr와 arrayList의 차이
        // 대부분 비슷하지만, 유일한 차이점
        // array: 길이 조정 불가
        // arrayList: 길이 조정 가능
//
//        Collection<Integer> x = new ArrayList<>();
//        ArrayList<Double> y = new ArrayList<>();
//        y.add(2.13);
//        ArrayList<String> list = new ArrayList<>();
//        list.add("hello");
//        list.add("0", "ryu");
//        Iterator<String> it = list.iterator();



    }
}
