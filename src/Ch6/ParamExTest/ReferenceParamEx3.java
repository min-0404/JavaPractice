package Ch6.ParamExTest;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);
        sumArr(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    static void printArr(int[] arr){
        for(int i : arr){
            System.out.println(i + " ");
        }
    }
    static void sortArr(int[] arr){
        for(int i = 0; i < arr.length-1; i++ ){
            for (int j = 0; j < arr.length - i -1; j++){
                if(arr[j] > arr[i]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    static void sumArr(int[] arr ){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        System.out.println(sum);
    }
}
