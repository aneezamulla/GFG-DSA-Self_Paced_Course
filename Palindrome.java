public class Palindrome {
    public static boolean check_palindrome(String str,int start,int end){
        if(start>=end)
            return true;
        return (str.charAt(start)==str.charAt(end) )&&check_palindrome(str,start+1,end-1);
    }
    public static void main(String[] args) {
        String str="MOM";
        int start=0,end=str.length()-1;
        System.out.println(check_palindrome(str,start,end));
    }
}
