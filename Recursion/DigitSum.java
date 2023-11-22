public class DigitSum {
    public static int sum(int n){
        if(n==0)
            return 0;
        return (n%10 + sum(n/10));
    }

    public static void main(String[] args) {
        int n=909;
        System.out.println(sum(n));
    }
}
