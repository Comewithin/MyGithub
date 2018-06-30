package project3_HashSet;

import java.util.HashSet;
//import java.util.Comparator;
import java.util.Iterator;

public class Project3_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Student> ts = new HashSet<Student>(/*new LengthComparator()*/);
		ts.add(new Student("haha",21));
		ts.add(new Student("lala",23));
		ts.add(new Student("kaka",22));
		ts.add(new Student("xixi",26));
		ts.add(new Student("xixi",26));
		//System.out.println(ts);
		Iterator<Student> it = ts.iterator();
		while(it.hasNext())
		{
			Student str = it.next();
			System.out.println("name:"+str.getName()+"------"+"age:"+str.getAge());
		}
	}
	
}


/*
//根据字符串长度进行排序
class LengthComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		int num = new Integer(o2.length()).compareTo(new Integer(o1.length()));
		if(num==0)
			return o2.compareTo(o1);
		return num;
	}
	
}
*/