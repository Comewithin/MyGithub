package test3;

public class Computer {
	private Host host;
	private Display display;
	
	public Host getHost()
	{
		return host;
	}
	public void setHost(Host host)
	{
		this.host = host;
	}
	
	public Display getDisplay()
	{
		return display;
	}
	public void setDisplay(Display display)
	{
		this.display = display;
	}
	//电脑运行方法
	public void run(){
	    System.out.println("你好，我是电脑，正在运行！");
        host.run();
	    display.run();
	}
	
	
}
