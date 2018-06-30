package project5_List;

import java.util.ArrayList;
import java.util.Iterator;

import project3_HashSet.Student;

public class Project5_Demo1 {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		 
		 list.add(new Student("lisi",22));
		 list.add(new Student("haha",21));
		 list.add(new Student("haha",21));
		 list.add(new Student("zhangsan",23));
		 list.add(new Student("lisi",22));
		 
		 
	     list = Single(list);
	     //System.out.println(list);
	     //System.out.println(list.remove(new Student("lisi",22)));
	     
		 Iterator<Student> it = list.iterator();
		 while(it.hasNext())
		 {
			 Student ha = it.next(); 
			 System.out.println("name: "+ha.getName()+"----"+"age: "+ha.getAge());
		 }
		 
//		 System.out.println("列表长度："+list.size());
//		 
//		 list.set(1, new Student("wangwu",23)); //修改元素
//		 System.out.println(list);
//		 
//		 System.out.println(list.subList(0, 2));//截取前两个元素

		 
//		 ListIterator<Student> it1 = list.listIterator();
//		 while(it1.hasNext())
//		 {		 
//			// if(i==0)
//			 list.add(new Student("zhaoliu",24));
//		 }
//		 System.out.println(list);

		 
		 //删除指定元素
//		 list.remove(2);
//		 list.remove(new Student("lisi",22));
//		 System.out.println(list);	 
//		 
//		 List<Student> ls = new ArrayList<Student>();
//		 ls.add(new Student("lisi",22));
//		 list.removeAll(ls);
//		 System.out.println(list);
	
	}
	
	public static ArrayList Single(ArrayList al)
	{
		ArrayList list = new ArrayList();
		Iterator t = al.iterator();
		while(t.hasNext())
		{
			Object obj = t.next();
			if(!list.contains(obj))
				list.add(obj);
		}
		return list;
		
	}
}



