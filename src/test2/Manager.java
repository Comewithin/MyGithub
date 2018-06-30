package test2;

public class Manager {

	private UserDao dao;
	public void save(String name, String pwd)
	{
		dao.save(name, pwd);
	}
	
	public UserDao getDao()
	{
		return dao;
	}
	
	public void setDao(UserDao dao)
	{
		this.dao = dao;
	}
	
	public void show()
	{
		System.out.println(dao.getUname()+dao.getPwd());
	}
}
