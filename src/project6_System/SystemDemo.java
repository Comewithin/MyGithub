package project6_System;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties prop = System.getProperties();
		
		Set<?> set = prop.keySet();
		
		Iterator<?> it = set.iterator();
		while(it.hasNext())
		{
			String record = (String) it.next();
			String value = (String) prop.get(record);
			System.out.println(record+":"+value);
		}
	}

}
