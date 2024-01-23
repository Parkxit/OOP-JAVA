
public class Project_Manager_op {

	public static void main(String[] args) {
		Project_Manager m=new Project_Manager();
		System.out.println("Enter the Project manager details: ");
		m.getdata();
		m.receive();
		System.out.println("The Project Manager details are: ");
		m.display();
		m.give();
	}

}
