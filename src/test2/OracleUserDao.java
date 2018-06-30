package test2;

public class OracleUserDao implements UserDao{

	private String uname,pwd;
	@Override
	public void save(String name, String pwd) {
		// TODO Auto-generated method stub
		System.out.println("用户"+name+"的账号已保存在Oracle数据库中");
	}

	//构造注入
	public OracleUserDao(String uname, String pwd) 
	{
		this.uname = uname;
		this.pwd = pwd;
	}
	
	/*
	//投值注入
	public void setUname(String uname)
	{
		this.uname = uname;
	}
	*/
	
	@Override
	public String getUname()
	{
		return uname;
	}
	
	/*
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
	*/
	
	@Override
	public String getPwd()
	{
		return pwd;
	}
}
