public class Sol31 {
    public static void main(String[] args) {
        int n = 5;
        String answer = "";
        String a = "수";
        String b = "박";

        for(int i = 1; i<=n; i++ ) {
            answer += i%2 != 0? a: b;
        }

        System.out.println(answer);
    }
}
