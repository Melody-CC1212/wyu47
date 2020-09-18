
import java.util.Date;

public class Emp {
	private String name;
	private int age;
	private String gender;
	private int salary;
	Date hireDate;

	public Emp(String name, int age, String gender, int salary, Date hireDate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hireDate = hireDate;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "姓名：" + name + ", 年龄：" + age + ", 性别：" + gender + ", 薪资：" + salary + ", 入职时间：" + hireDate + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Emp emp = (Emp) o;
		return age == emp.age && salary == emp.salary && name.equals(emp.name) && gender.equals(emp.gender);
	}

	public static void main(String[] args) {
		Emp emp = new Emp("张三", 25, "男", 5000, new Date());
		System.out.println(emp.toString());
		System.out.println(emp.equals(emp));
	}
}
