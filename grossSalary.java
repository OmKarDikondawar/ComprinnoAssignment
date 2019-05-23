import java.util.Scanner;
public class GrossSalaryCalculation {
	
	//**************Pseudo COde***************
	
	//Take number of tests as input - T
	//Perform all validity checks on T (1 ≤ T ≤ 100)
	//For a loop in range 0 to (T-1),
	
		//take employee Salary 
		//calculate HRA and DA
		//the calculate grossSalary as addition of employeeSalary,DA, HRA
		//then print the result





	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
			 //Taking number of test case from the user
			 //it should be only integer
	        int T=input.nextInt();
			
			//while loop for interating number of test case
			//it runs upto test case
	        while(T-->0){
				
	        	//taking employee salary from the user
				//it should be double value
	        double employeeSalary=input.nextDouble();
			
			//logic for employee salary less than 1500
	        if(employeeSalary<1500){
				
				//then HRA = 10% of base salary and DA = 90% of basic salary.
	            double HRA=0.1*employeeSalary;
	            double DA=0.9*employeeSalary;
				
				//Gross Salary = Basic Salary + HRA + DA
				double grossSalary=employeeSalary+DA+HRA;
				
				//printing gross salary
				System.out.println(grossSalary);
	           
	        }
			
			//logic for salary is either equal to or above Rs. 1500,
	        else{
				
				//then then HRA = Rs. 500 and DA = 98% of basic salary.
	            double HRA=500;
	            double DA=0.98*employeeSalary;
				
				//Gross Salary = Basic Salary + HRA + DA
				double grossSalary=employeeSalary+DA+HRA;
				
				//printing gross salary
				System.out.println(grossSalary);
	           
	        }
	        }	
	}

	
}