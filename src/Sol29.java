import java.util.Arrays;

public class Sol29 {
    public static void main(String[] args) {
        int[] arr = {4};
        int[] answer = {};
        int min = Arrays.stream(arr).min().getAsInt();;

        answer = Arrays.stream(arr)
                .filter(n -> n != min)
                .toArray();

        if(answer.length==0){ answer = new int[]{-1}; }
        System.out.println(Arrays.toString(answer));
    }
}
