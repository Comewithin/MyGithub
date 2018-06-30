package test1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hi = (Hello) bf.getBean("hello");
		Hello hi1 = (Hello) bf.getBean("hello");
		System.out.println(hi==hi1);
		System.out.println(hi.equals(hi1));
		hi.sayHello("zhangsan");
	}

}
