package recursion;

public class Reverse
{
    public String reverse(String str)
    {
        if (str.length() == 0)
        {
            return str;
        }
       return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
    }
}
