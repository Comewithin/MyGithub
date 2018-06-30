package test2;

public class MySQLUserDao implements UserDao{

	private String uname,pwd;
	@Override
	public void save(String name, String pwd) {
		// TODO Auto-generated method stub
		System.out.println("用户"+name+"的账号已保存在MySQL数据库中");
	}

	public void setUname(String uname)
	{
		this.uname = uname;
	}
	@Override
	public String getUname()
	{
		return uname;
	}
	
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
	@Override
	public String getPwd()
	{
		return pwd;
	}
}
