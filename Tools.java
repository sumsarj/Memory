package Memory;

import java.util.Arrays;

public class Tools {
	
	public static void randomOrder(Object[] a)
	{		
		Object[] b = new Object[a.length];
		
		for(int j = 0; j< a.length; j++)
			b[j] = a[j];
		
		Arrays.fill(a, null );
		for(int i = 0; i < b.length; i++)
			{
				while(true)
				{
					int random = (int)(Math.random() * b.length);
					if(a[random] == null)
					{
						a[random] = b[i];
						break;
					}
					
						
				}
		
			}
	
	}
}
