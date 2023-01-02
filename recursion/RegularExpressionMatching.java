package recursion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching
{
    public boolean isMatch(String s, String p)
    {
        if ((s.length() == 0) || p.length() == 0)
        {
            return false;
        }

        if (p.charAt(p.length()-1) != '*')
        {
            return s.equals(p);
        }

        else
        {
            Pattern pattern = Pattern.compile(p);
            Matcher matcher = pattern.matcher(s);

            return matcher.find();
        }



    }
}
