public class Multiplicacion
{	
	public int multiplicar(int multiplicando, int multiplicador)
	{
		if(multiplicador == 1)
		{
			return multiplicando;
		}
		else
		{
			if(multiplicador == 0)
			{
				return multiplicando;
			}
			else
			{
			 return multiplicando + multiplicar(multiplicando,multiplicador-1);
			}
		}
	}
}