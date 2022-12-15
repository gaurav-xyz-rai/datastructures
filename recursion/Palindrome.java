package recursion;

public class Palindrome
{
    public boolean isPalindrome(String s)
    {
        return  (reverse(s).equalsIgnoreCase(s));
    }

    public String reverse(String str)
    {
        if (str.length() == 0)
        {
            return str;
        }
        return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
    }
}
