package test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //byName
        Computer computer1 = (Computer)ac.getBean("computer1");
        System.out.println("autowire=\"byName\":");
        computer1.run();
        
        //byType
        Computer computer2 = (Computer)ac.getBean("computer2");
        System.out.println("autowire=\"byType\":");
        computer2.run();
        
        //default
        Computer computer3 = (Computer)ac.getBean("computer3");        
        System.out.println("autowire=\"default\":");
        computer3.run();
	}

}
