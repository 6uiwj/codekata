import java.util.Arrays;
import java.util.List;

public class Sol34 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String answer = "";
        int[] ordered = new int[s.length()];

        for (int i = 0; i< s.length(); i++) {
            ordered[i] = s.charAt(i);
        }
        Arrays.sort(ordered);

        for (int j = ordered.length-1; j>=0; j--) {
            answer+=(char)ordered[j];
        }
        System.out.println(answer);
    }

}
