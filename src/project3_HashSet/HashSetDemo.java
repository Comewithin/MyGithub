package project3_HashSet;

import java.util.HashSet;
//import java.util.Comparator;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Student> ts = new HashSet<Student>();
		ts.add(new Student("haha",21));
		ts.add(new Student("lala",23));
		ts.add(new Student("kaka",22));
		ts.add(new Student("xixi",26));
		ts.add(new Student("xixi",26));
		Iterator<Student> it = ts.iterator();
		while(it.hasNext())
		{
			Student str = it.next();
			System.out.println("name:"+str.getName()+"------"+"age:"+str.getAge());
		}
	}
	
}

