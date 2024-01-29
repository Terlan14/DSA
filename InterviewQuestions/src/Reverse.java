public class Reverse {
    public static void main(String[] args) {
        long reverse=reverseInteger(2546354);
        System.out.println(reverse);
    }
    //we have given number for example 123 and we return 321
    public static long reverseInteger(int number){
        boolean isNegative=number<0;
        if (isNegative){
            number=number*(-1);
        }
        int reverse=0;
        int lastDigit;
        while (number>0){
            lastDigit=number%10;
            reverse=reverse*10+lastDigit;
            number=number/10;
        }
        return isNegative ? reverse*(-1) : reverse;
    }
}
