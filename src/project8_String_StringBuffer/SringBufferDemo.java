package project8_String_StringBuffer;

public class SringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StringBuffer a = new StringBuffer("QQ");
//		a.append("Email");
//		pop(a);
		
//		a.delete(0, 2);//删除第0到1的元素
//		pop(a);
//		a.deleteCharAt(0);//删除第0个元素
//		pop(a);
//		
//		pop(a.length());
//		
//		pop(a.charAt(0));//获取从下标为1的字符
//		
//		pop(a.substring(0));//获取从下标为0到最后的字符
//		pop(a.substring(0,4));//获取从下标为0到3的字符
//		
//		pop(a.indexOf("a"));//获取位置
//		pop(a.lastIndexOf("a"));
		
//		pop(a.insert(3, "E"));//在下标为0的位置插入QQ字符
		
//		pop(a.replace(0, 2, "QQ"));//从下标为0到1的位置用E来替换
//		
//		a.setCharAt(0, 'E');//下标为0的位置用E来替换
//		pop(a.toString());
//		
//        pop(new StringBuffer("abc").reverse());//字符串反转
		
		
		String str1 = "abcd.jpg";
		pop(str1.replace(".", "(big)."));
		
	}
	
	
	public static void pop(Object obj)
	{
		System.out.println(obj);
	}

}
