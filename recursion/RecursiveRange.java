package recursion;

public class RecursiveRange
{
    public int recursiveRange(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        return num+recursiveRange(num-1);
    }
}
