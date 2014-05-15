package package1;

public class nCk {

	public int nChooseK(int n, int k){
		if(k < 0 || k > n)
			return 0;
		if(k == 1)
			return n;
		if(k == 0)
			return 1;
		return nChooseK(n-1, k) + nChooseK(n-1, k-1);
	}
	
	public static void main(String[] args){
		nCk n = new nCk();
		System.out.println(n.nChooseK(5, 3));
		System.out.println(n.nChooseK(6, 5));
		System.out.println(n.nChooseK(0, 0));
	}
}
