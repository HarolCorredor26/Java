public class Fibo
{
	public int fiboacci(int a)
	{
		if(a==1)
			return 0;
		if(a==2)
			return 1;
		return fiboacci(a+1)+fiboacci(a-2);
	}

}