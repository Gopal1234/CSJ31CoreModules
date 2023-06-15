class Associate
{
	//variable or attributes
	//methods 
	//constructors
	private int associateId;
	private String asscociateName;
	private String workStatus;
	
	//defining constructor for all attributes
	
	
	public int getAssociateId() {
		return associateId;
	}
	public Associate(int associateId, String asscociateName) {
		
		this.associateId = associateId;
		this.asscociateName = asscociateName;
		
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public String getAsscociateName() {
		return asscociateName;
	}
	public void setAsscociateName(String asscociateName) {
		this.asscociateName = asscociateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	/*
	 * 
	 *  if number<=20 the "Core Phase";
	 *  if number >20 || number<=40  then works status should be "Advance phase"
	 *   if number >40 || number<=60 then work status should be "project phase"
	 *   if number >60 the work status should  be "deployed into project"
	 * 
	 * 
	 * 
	 * 
	 */
	public void trackWorkStatus(int days)
	{
		if(days<=20)
		{
			setWorkStatus("core phase");
		}else if(days>20 && days<=40)
		{
			setWorkStatus("Advance phase");
		}else if(days>40 && days<=60)
		{
			setWorkStatus("Project Phase");
		}else if(days>60)
		{
			setWorkStatus("deployed into project");
		}
		
		
	}
	
	
	
	
	
}





public class TestMyApp {

	public static void main(String[] args) {
    
		// System.out.println("My first eclipse programs");
		
//creating object of Associate class
		Associate obj=new Associate();
		//calling setter method
		obj.setAssociateId(108);
		obj.setAsscociateName("Ravi");
		obj.trackWorkStatus(65);
		
		//calling getter method
		int id=obj.getAssociateId();
		String name=obj.getAsscociateName();
		String workStatus=obj.getWorkStatus();
		
		System.out.println(id + " "+name+ " "+workStatus);

		

	}

}
