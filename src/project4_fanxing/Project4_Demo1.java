package project4_fanxing;


class Student
{
	
}

class Teacher
{
	
}

class Utils
{
	public <Q> void setObject(Q q)
	{
		System.out.println("设置"+q);
	}
	
	public <T> void getObject(T t)
	{
		System.out.println("获取"+t);
	}
}

public class Project4_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utils u = new Utils();
		
		u.setObject(new Student());
		u.getObject(new Teacher());
	}

}
