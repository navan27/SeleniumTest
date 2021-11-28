package test_1;


import java.util.*;


class StudentInfo{
	private int id;
	private String name;
	private double cgpa;
		   
	public StudentInfo(int id, String name, double cgpa) {
		super();  
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		
	}
		   
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}
		
}

public class N1
{
	public static void main(String[] args){
	System.out.print("Please enter the number of Students Information you want to enter: "); 
	Scanner input = new Scanner(System.in);
	int testCases = input.nextInt();
	List<StudentInfo> StudentList = new ArrayList<StudentInfo>();
	while(testCases>0){
	int id = input.nextInt();
	String fname = input.next();
	double cgpa = input.nextDouble();
		         
	StudentInfo info = new StudentInfo(id, fname, cgpa);
	StudentList.add(info);
	testCases--;

	}
		     
	Collections.sort(StudentList, new Comparator<StudentInfo>() {
		            
		public int compare(StudentInfo s1, StudentInfo s2) {		            	   	  

			int compare = s1.getName().compareTo(s2.getName());
			
			if((s1.getCgpa() < s2.getCgpa()) && (s1.getCgpa() != s2.getCgpa()))
			{
				return 1;
			}
			
			else if((s1.getCgpa() == s2.getCgpa()) && (compare < 0))
		     {
		        return -1;
		     }

		     else if((s1.getCgpa() == s2.getCgpa()) && (compare > 0))
		     {
		         return 1;

		     }
			
		     else if((s1.getCgpa() == s2.getCgpa()) && compare == 0 && (s1.getId() < s2.getId()))

		     {
		    	  return 1;
		    }

		      else
		      {
		         return -1;

		      }

		}	   		              

	});


	for(StudentInfo info: StudentList){
		
		System.out.println(info.getName());
	}

	}

}