package package1;

/**********************************************************************
 * Does the fibonacci sequence recursively
 * 
 * @author John Tunisi
 * @version 10/4/13
 *********************************************************************/

public class Fibonacci {

	public int fib(int n){
		if(n < 3)
			return 1;
		else
			return fib(n - 1) + fib(n- 2);
	}
	
	public static void main(String[] args){
		Fibonacci f = new Fibonacci();
		for(int i = 0; i <= 50; i++){
			System.out.println("Fibonacci of " + i + "\t" + f.fib(i));
		}
	}
}
