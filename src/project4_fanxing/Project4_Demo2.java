package project4_fanxing;

class Student1
{
	
}

class Teacher1
{
	
}

class Utils1<Q>
{
	private Q q;
	public void setObject(Q q)
	{
		this.q = q;
	}
	
	public Q getObject()
	{
		System.out.println("获取"+q);
		return q;
	}
}


public class Project4_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utils1<Student1> u = new Utils1<Student1>();
		
		u.setObject(new Student1());
		u.getObject();
	}
}
