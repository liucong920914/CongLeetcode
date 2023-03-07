public class no7_ReverseInteger {

	public static int reverse(int x) {
		
		long re = 0;
		int tmp = 0;
		boolean negative = x<0;
		if (negative) {
			x = -x;
		}
		while(x>0) {
			tmp = x % 10;
			x = x / 10;
			re = re * 10 + tmp;
		}
		if (negative) {
			re = -re;
		}
		if (re > Integer.MAX_VALUE || re < Integer.MIN_VALUE) {
			return 0;
		}
		else {
			return (int)re;
		}
	}
	
	public static void main(String []args) {
		int x = -123;
		int result = reverse(x);
		System.out.println(result);
	}
}

