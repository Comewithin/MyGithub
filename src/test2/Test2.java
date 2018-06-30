package test2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		Manager ma = (Manager) bf.getBean("manager");
		//ma.save("lisi","12345");
		ma.show();
		System.out.println(ma.getDao());
	}

}
