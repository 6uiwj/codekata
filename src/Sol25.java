import java.util.Arrays;

public class Sol25 {
    public static void main(String[] args) {
        int[] arr= {5, 6, 7, 10};
        int divisor = 8;
        int[] d = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor==0) {
                d[i]=arr[i];
            } else {
                d[i]=0;
            }
        }
        int[] answer = Arrays.stream(d)
                .filter(n -> n != 0)
                .sorted()
                .toArray();
        if(answer.length==0){
            answer = new int[]{-1};
        }


    }
}
