package methodsAdding;

public class Square {
	public static  long factorial() {
		int n = 4;
		long product = 1;
		for(int i =1;i <= n;i++) {
			product =product*i;
			}
		return product;
	}
	public static void main(String[] args) {
		
		System.out.println(factorial());
	}
}
