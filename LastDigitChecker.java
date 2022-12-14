public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(a<10 || a>1000 || b<10 || b>1000 || c<10 || c>1000 ){
            return false;
        }

        return (a%10)==(b%10) || (b%10)==(c%10) || (c%10)==(a%10);
    }

    public static boolean isValid(int n){
        if(n<10 || n>1000){
            return false;
        }
        return true;
    }
}
