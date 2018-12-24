public class Employee {
//Instance variable...
	private int eid;
	private String ename;
	private float esal;
	private double asal;

	public Employee(){
		this(11,"aaa",2000);
		System.out.println("Default Construtor..."+esal);
		System.out.println("Annual Sal :"+asal);
	}
	
	public Employee(int eid, String ename, float esal) {
		this(esal*12);
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		System.out.println("in second constructor :"+this.esal);
	}
	public Employee(double asal){
		this.asal=asal;
	}
	
	
	
	
	
	
	
}
