import java.util.Scanner;

class Customer
{
	
	//These all attubutes or properties of customer class
	//members of the class are : variable, method, constructor
	//access specifier: controls the visibility of the member  of the class
	//public
	//private
	//default
	//protected
	private int customerId;//1
	private String customerName;//
	private String address;//
	private long phoneNumber;//
	private String orderName;//
	//calling new  Customer(1,"Ravi","Pune",816236337L,"TV")
	public Customer(int customerId, 
			String customerName, 
			String address, 
			long phoneNumber, 
			String orderName) {
		System.out.println(this);
		
	this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.orderName = orderName;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getId()
	{
		return customerId;
	}
	
	public  String  getCustomerName()
	{
		return customerName;
	}
	public String  getAddress()
	{
		return address;
	}
	
	public long getPhone()
	{
		return phoneNumber;
	}
	public String getOrderName()
	{
		return orderName;
	}
	//what are ways are available to initialize these all properties
	
	
	
}

class CustomerService
{
	//providing methds to provide service for customer
	
	public String getCustomer(Customer customer)
	{
		int cId= customer.getId();
	       String cName= customer.getCustomerName();
	       String cAddress=customer.getAddress();
	        long ph=customer.getPhone();
	       
	        return cId+ " "+cName+ " "+cAddress+ " "+ph;
		
	}
	
	public Customer updatePhone(Customer customerObj, long newPhoneNumber)
	{
	   customerObj.setPhoneNumber(newPhoneNumber);
	   return customerObj;
	}
	public Customer updateOrder(Customer customerObj, String newOrderName)
	{
		return null;
	}
	
	
	
	
}



public class TestCustomerApp {
  public void displayMsg()
  {
	  System.out.println("welcome to  cyber successs");
  }
	public static void main(String[] args) {
		//creating object of customer class and intializing all properties
	Customer customerObj=new Customer(1,"Ravi","Pune",816236337L,"TV");
	/*TestCustomerApp obj=new TestCustomerApp();
	obj.displayMsg();
	
  int cId= customerObj.getId();
       String cName= customerObj.getCustomerName();
       String cAddress=customerObj.getAddress();
        long ph=customerObj.getPhone();
        
        System.out.println(cId+ " "+cName+ " "+cAddress+ " "+ph);*/
	
	
	CustomerService service=new CustomerService();
	String customerDetails= service.getCustomer(customerObj);
	System.out.println(customerDetails);
	
	System.out.println("enter new phone number to update");
	Scanner sc=new Scanner(System.in);
     long  phone=sc.nextLong();
     Customer updatedCustomerObject=   service.updatePhone(customerObj, phone);
     String customerDetails1= service.getCustomer(updatedCustomerObject);
 	System.out.println(customerDetails1);
  
	
	}

}
