package functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person
{
	int age;
	String name;
	int salary;
	public Person(int age,String name, int salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString()
	{
		return "Person{name='" + name + "', age=" + age + ", salary=" + salary + "}";
	}

}
public class SortingPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> p=new ArrayList<>();
		p.add(new Person(28,"Smit",56787));
		p.add(new Person(20,"Sm",56787));
		p.add(new Person(23,"Smgf",56787));
		p.add(new Person(33,"Smicxv",56787));
		p.add(new Person(64,"Smcvfd",56787));
		
		Collections.sort(p,(p1,p2)->Integer.compare(p1.age, p2.age));
		for(Person l:p)
		System.out.println(l);
		

	}

}
