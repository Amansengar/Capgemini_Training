
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HELLO AMAN");
		// -2^7 to 2^7-1 ----   { -128 to 127 }
		byte x = 127;
		System.out.println(x);
		float d = 38.43f;
		System.out.println("d");
		int c = 'A';
		System.out.println(c);
		char ch = 'D';
		System.out.println(ch);
		int op = 2;
		System.out.println(op++);
		System.out.println(op);
		int op2 = 3;
		System.out.println(++op2);
		int  a = 10;
		int b =98;
		System.out.println(a>b?a:b);
		String s = new String("aman sengar");
		System.out.println(s);
		System.out.println(User.num);
		User.m1();
		
	}

}
class User
{
	String name;
    static int num = 30;
	public static void m1()
	{
		System.out.println(num);
	}
}
