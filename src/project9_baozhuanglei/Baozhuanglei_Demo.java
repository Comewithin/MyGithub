package project9_baozhuanglei;

public class Baozhuanglei_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a = Integer.parseInt("123");
		//int a = new Integer("123");
		pop(a);
		
		Integer a1 = new Integer(123);//装箱
		pop(a1.intValue());//拆箱
		
		//Integer a2 = null;√   这个是对的
		//int a3 = null;    ×   这个是错的
		pop(a1+2);//自动拆箱，然后和整数2相加，这个要注意null值
		
		String b = Integer.toString(456);
		//String b = new Integer(456).toString();
		pop(b);
		
		int c = Integer.parseInt("3c",16);//十六进制转成十进制
		pop(c);
		
		int d = Integer.parseInt("10101001",2);//二进制转成十进制
		pop(d);
		
		pop(Integer.toBinaryString(10));//十进制转成二进制
		pop(Integer.toOctalString(10));//十进制转成八进制
		pop(Integer.toHexString(10));//十进制转成十六进制
		
		int i = 1270;
		int j = 1270;
		pop(i==j);//true
		
		Integer m = 127;
		Integer n = 127;
		pop(m==n);//true，因为数值在byte范围内-128~127，所以如果数值已存在，则不用再开辟新的空间
		
		Integer p = 128;
		Integer q = 128;
		pop(p==q);//false，因为数值不在byte范围内-128~127，所以开辟了新的空间
		
		
	}

	public static void pop(Object obj)
	{
		System.out.println(obj);
	}
}
