
public class Main {
	public static void main(String[] args) { 
		
		int num =199;  /* working if
		 
		 */
		if (num < 100) System.out.println ("num lover then 100");
		
		else {
			System.out.println("num higher the 100");
		}
     
		int sob;  /* working for 
		
		*/
		
	for(sob=0; // first status
		sob<10; // condition
		sob +=1	) // growth	
		System.out.println ("value of sob" +sob);  // operator
		
		/*
		 * 
		 * while
		 * 
		 * */
		
	int money=100;
	/*
	while (money>0) // condition (if folce body of cycle dont call)
		{
		System.out.println("loss of money" +money);
		money--;
		
		
	}
	*/
	int i, j;
	i = 100;
	j = 200;
	// вычисление среднего значения i и j
	while(++i < --j) ; // в этом цикле тело цикла отсутствует
	System.out.println("Среднее значение равно " + i);
	
	
	/*
	 * 
	 * 
	 * do while
	 * 
	 * 
	 * */
	
	
	
	do {
		
		System.out.println("loss of dolars " +money);
		money--;	}
	while (money>0);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
}