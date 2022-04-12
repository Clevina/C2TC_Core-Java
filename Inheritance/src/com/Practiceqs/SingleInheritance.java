package com.Practiceqs;
class Doctor
{
	float salary=30000;
	
}
class surgeon extends Doctor
{
	float bonus=20000;
}
public class SingleInheritance {

	public static void main(String[] args) {
		surgeon s=new surgeon();
		System.out.println("Salary of surgeon:"+s.salary);
		System.out.println("Bonusof surgeon:"+s.bonus);

	}

}
