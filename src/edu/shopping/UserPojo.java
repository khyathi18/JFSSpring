package edu.shopping;

public class UserPojo {

	String name;
	int age;
	long mobileNo;
	ProdPojo a;
	UserPojo(int age,ProdPojo a)
	{
		this.age=age;
		this.a=a;
	}
//	UserPojo(ProdPojo a)
//	{
//	this.a=a;	
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "UserPojo [name=" + name + ", age=" + age + ", mobileNo=" + mobileNo + ", a=" + a + "]";
	}
	
}

