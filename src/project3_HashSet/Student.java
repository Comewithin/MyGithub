package project3_HashSet;

public class Student {

	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println(this.getName()+"---hashCode---");
		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		System.out.println(this.getName()+"---equals---"+((Student) obj).getName());
		return true;
		
//		if(!(obj instanceof Student))
//			return false;
//		Student stu = (Student)obj;
//		//System.out.println(this.name+"------"+stu.name);
//		return this.name.equals(stu.name)&&this.age == stu.age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
