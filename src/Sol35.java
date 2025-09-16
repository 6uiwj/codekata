public class Sol35 {
    public static void main(String[] args) {
        long money = 20;
        int price = 3;
        int count = 4;
        long answer = 0;
        long m = money;
        for(int i = 1; i<=count; i++) { //1234
            m -= price*i; //20-30
        }
        answer = m >= 0 ? 0 : m*(-1);
        System.out.println(answer);
    }
}
