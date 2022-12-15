package recursion;

import java.util.Locale;

public class CapitalizeWords
{
    public String capitalizeWord(String str)
    {
        if (str.isEmpty())
        {
            return str;
        }
        // find the last char of the String
        String chr1 = String.valueOf(str.charAt(str.length()-1));

        // tackle the single letter string
        if (str.length() == 1)
        {
            chr1 = chr1.toUpperCase();
            return chr1;
        }
        // find the char after the space
        if ((str.substring(str.length()-2,str.length()-1)).equals(" "))
        {
            chr1 = chr1.toUpperCase();
        }
        return (capitalizeWord(str.substring(0,str.length()-1)) + chr1);
    }
}
