public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(5, 2));
		
		System.out.println(multi(5, 3));
	}

	public static int add(int a, int b) {

		int result = a + b;

		return result;
	}
	public static int multi(int a, int b) {
		
		int result = 0;
		
		for (int i = 0; i < b; i++ ) {
			result = result + a;
		}
		
		return result;
	}
}
