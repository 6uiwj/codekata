//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int answer = 0;

        for(int i = left; i <= right; i++) { //13, 14, 15, 16, 17
            //int num = i; //14
            int d = 0;

                for(int j = 1; j<=i; j++) { //j= 1<=13
                    if(i%j==0) { //2%1=0
                        d++; //2
                    }
                }

            answer = d % 2 ==0 ?  answer+i : answer-i; //-1
            }
        System.out.println(answer);
        }
    }
