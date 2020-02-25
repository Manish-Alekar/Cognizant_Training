
public class Task2 {
	public int Daphne(int [] a)
    {
        boolean isEven = false, isOdd = false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                isEven = true;
            }
            else
            {
                isOdd = true;
            }
        }
       
        if(isEven && isOdd)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
