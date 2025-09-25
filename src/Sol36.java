public class Sol36 {
    public static void main(String[] args) {
        //s.length = 4 or 6
        String s = "22343";
        boolean answer = true;

        if(s.length()==4 || s.length()==6 ) {
            for(int i = 0; i<s.length(); i++) {
                if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                    answer = false;
                    break;
                }
            }
        } else answer=false;
        System.out.println(answer);

    }
}
