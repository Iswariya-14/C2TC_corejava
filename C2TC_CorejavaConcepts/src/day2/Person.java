package day2;

public class Person 
{
  private int id;
  private String name;
  private int age;
  private String city;
  public int getId() {
  return id;
}

public Person() 
{
	System.out.println("object created");
}

public void setId(int id) {
	this.id = id;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
  
  
}
