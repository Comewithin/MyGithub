package project3_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(new Student("haha",21));
		ts.add(new Student("lala",23));
		ts.add(new Student("kaka",26));
		ts.add(new Student("xixi",22));
		ts.add(new Student("xixi",22));
		
		Iterator<Student> it = ts.iterator();
		while(it.hasNext())
		{
			Student stu = it.next();
			System.out.println(stu);
		}
		
	}

}
