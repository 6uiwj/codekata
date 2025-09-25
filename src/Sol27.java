public class Sol27 {
    public static void main(String[] args) {
        String phone_number = "01043333234";
        String answer = "";

        String suf = phone_number.substring(phone_number.length()-4);
        String pre = phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]","*");
        System.out.println(pre+suf);
    }
}
