package project2_TreeMap;

//import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;//可以排序，HashMap无序

public class Project2_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Student,String> map = new TreeMap<Student,String>(/*new AgeComparator()*/);
		map.put(new Student("c",22),"天津");
		map.put(new Student("a",28),"北京");
		map.put(new Student("c",22),"海南");
		map.put(new Student("b",21),"上海");
		map.put(new Student("a",28),"北京");
		
//		Set<Student> set2 = map.keySet();
//		Iterator<Student> it2 = set2.iterator();
//		while(it2.hasNext())
//		{
//			Student s = (Student) it2.next();
//			System.out.println(s.getName()+"……"+s.getAge());
//		}
		
		Set<Map.Entry<Student, String>> set1 = map.entrySet();
		Iterator<Map.Entry<Student, String>> it1 = set1.iterator();
		while(it1.hasNext())
		{
			Map.Entry<Student, String> me = it1.next();
			Student key = me.getKey();
			String value = me.getValue();
			System.out.println("键:"+key.getName()+","+key.getAge()+", 值:"+value);
			//System.out.println(me);
		}
	}

}

//年龄比较器
//class AgeComparator implements Comparator<Student>
//{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		int num = new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
//		if(num == 0)
//			return o1.getName().compareTo(o2.getName());
//		return num;
//	}
//	
//}
