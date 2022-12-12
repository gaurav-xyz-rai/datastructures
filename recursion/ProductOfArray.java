package recursion;

public class ProductOfArray
{
    public int productofArray(int A[], int N)
    {
        if (A.length < N)
        {
            N = A.length-1;
        }
        if (N == A.length)
        {
         //   N = A.length-1;
        }
        if (A.length == 0)
        {
           return 0;
        }
        if (N == 1)
        {
            return A[N-1];
        }
        if (N == 0)
        {
            return A[0];
        }
        if (N < 0)
        {
            N = Math.abs(N);
        }
        return A[N-1]*productofArray(A,N-1);
    }
}
