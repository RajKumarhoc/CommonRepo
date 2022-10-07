import java.io.* ;
import java.util.Scanner ;
import java.lang.* ;
class Employee
{
	String name, address, mail, mobile ;
	int id ;
	float da, hra, bf, scf, gross, net, b, pf ;
	Scanner s = new Scanner(System.in) ;
	void getData()
	{
		System.out.print("Enter name :\t") ;
		name = s.next() ;
		System.out.print("\nEnter id :\t") ;
		id = s.nextInt() ;
		System.out.print("\nEnter the address :\t") ;
		address = s.next() ;
		System.out.print("\nEnter mail :\t") ;
		mail = s.next() ;
		System.out.print("\nEnter mobile.no \t") ;
		mobile = s.next() ;
	}
	void calc(float basic)
	{
		b = basic ;
		da = (float)(basic*97/100) ;
		hra = (float)(basic*10/100) ;
		pf = (float)(basic*10/100) ;
		scf = (float)(basic*0.1/100) ;
		gross = basic + da + hra + pf + scf ;
		net = gross - pf ;
	}
	void display()
	{
		System.out.print("\n***** Employee Details *****") ;
		System.out.print("\nEmployee Name :\t" + name) ;
		System.out.print("\nEmployee ID :\t" + id) ;
		System.out.print("\nEmployee Address :\t" + address) ;
		System.out.print("\nEmployee Mobile Number :\t" + mobile) ;
		System.out.print("\nEmployee Mail ID :\t" + mail) ;
		System.out.print("\nEmployee Basic Pay :\t" + b) ;
		System.out.print("\nEmployee DA :\t" + da) ;
		System.out.print("\nEmployee HRA :\t" + hra) ;
		System.out.print("\nEmployee PF :\t" + pf) ;
		System.out.print("\nStaff Club Fund :\t" + scf) ;
		System.out.print("\nGross Salary :\t" + gross) ;
		System.out.print("\nNet Salary :\t" + net) ;
	}
}
class Programmer extends Employee
{
	float bp ;
	Programmer()
	{
		bp = 2500 ;
	}
}
class Ap extends Employee //Ap => Assistant Professor
{
	float bp ; 
	Ap()
	{
		bp = 5000 ;
	}
}
class Asso extends Employee
{
	float bp ;
	Asso()
	{
		bp = 7500 ;
	}
}
class Prof extends Employee
{
	float bp ;
	Prof()
	{
		bp = 10000 ;
	}
}
public class EmployeeSalary
{
	public static void main(String [] array)
	{
		Scanner s  = new Scanner (System.in) ;
		System.out.print("1.Programmer\n2.Assitant Professor\n3.Associate\n4.Professor\nEnter Your Department :\t") ;
		int choice = s.nextInt() ;
		switch (choice)
		{
			case 1:
				System.out.println("\nEnter Programmer Details :") ;
				Programmer p = new Programmer() ;
				p.getData() ;
				p.calc(p.bp) ;
				p.display() ;
				break ;
			case 2:
				System.out.println("\nEnter Assistant Professor Details :") ;
				Ap ap = new Ap() ;
				ap.getData() ;
				ap.calc(ap.bp) ;
				ap.display() ;
				break ;
			case 3:
				System.out.println("\nEnter Associate Details :") ;
				Asso as = new Asso() ;
				as.getData() ;
				as.calc(as.bp) ;
				as.display() ;
				break ;
			case 4:
				System.out.println("\nEnter Professor Details :") ;
				Prof pro = new Prof() ;
				pro.getData() ;
				pro.calc(pro.bp) ;
				pro.display() ;
				break ;
			default :
				System.out.println("\nInvalid Choice") ;
		}
		System.out.println("\n***** Thank You *****") ;
	}
}