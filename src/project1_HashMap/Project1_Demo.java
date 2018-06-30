package project1_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Project1_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> map = new HashMap<String,String>();
		map.put("01", "zhangsan");
		map.put("02", "lisi");
		map.put("03", "wangwu");
		System.out.println(map);
		
		String s1 = map.get("01");
		System.out.println(s1);
		
		//String s2 = map.remove("03");
		//System.out.println(s2);
		
		//Set集合有迭代器，Map集合没有迭代器
		Set<String> set = map.keySet();
		//迭代器
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String key = it.next();
			String value = map.get(key);
			System.out.println("key:"+key+", value:"+value);
		}
		
		//Map.Entry<String, String>代表Map集合的映射关系，是一个接口，Entry是Map接口里的一个内部接口
		Set<Map.Entry<String, String>> set1 = map.entrySet();
		Iterator<Map.Entry<String, String>> it1 = set1.iterator();
		while(it1.hasNext())
		{
			Map.Entry<String, String> me = it1.next();
			String key = me.getKey();
			String value = me.getValue();
			System.out.println("键:"+key+", 值:"+value);
			//System.out.println(me);
		}
		
		
	}

}
