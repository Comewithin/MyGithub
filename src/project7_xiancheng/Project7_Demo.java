package project7_xiancheng;

public class Project7_Demo implements Runnable{

	int b = 100;
	//synchronized直接作用于实例方法相当于对当前实例加锁
	synchronized void m1() throws InterruptedException
	{
		b = 1000;
		Thread.sleep(500);//6
		System.out.println("b="+b);
	}
	
	synchronized void m2() throws InterruptedException
	{
		Thread.sleep(250);//5
		b = 2000;
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//for(int i = 0; i<10; i++){
		Project7_Demo pd = new Project7_Demo();
		Thread pd1 = new Thread(pd);//1
		pd1.start();//2：启动需要消耗一定的时间，所以步骤3先获得锁
		
		pd.m2();//3
		//步骤3执行完后步骤2也已经准备就绪，若步骤4（主线程）先执行的话结果是2000，若步骤二（子线程）的run方法中的m1()方法先执行则结果为1000
		System.out.println("main thread b="+pd.b);//4
		//}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
