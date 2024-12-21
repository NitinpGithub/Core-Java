package OOPs;

class student
{
	String name;
	int id;
	String branch;
	
	student(String name,int id,String branch)
	{
		this.name=name;
		this.id=id;
		this.branch=branch;
	}
	
	public void display()
	{
		System.out.println(name+" "+id+" "+branch);
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
		/* Process of wrapping a data and method into single unit
		 We can achieve encapsulation by declaring method or variable as private or class as a private
		 
		 Better control
		 Security
		 flexibility
		 
		 To read/write the private data in encapsulation we can use getter and setter method
		 
		 Getter Method - 
		 public Data_type get<method_Name>()
		 {
		 	return variableName;
		 }
		 
		 Setter Method - 
		 
		 public void Set<method_Name>(Data_type variableName)
		 {
		 	variableName = variableName
		 }
		*/
		
		student s1 = new student("Nitin",1,"Electrical");
		s1.display();
		

	}

}
