import java.util.*;
import java.lang.*;
import java.io.*;


//**************Pseudo COde***************
	
	//Take number of tests as input - T
	//Perform all validity checks on T (1 ≤ T ≤ 100)
	//For a loop in range 0 to (T-1),
	
		//take size of string array
		
		//Storing all the string in String array
		//checkng if pair of adjacent string is same then it will print NO
			// else print YES
	

class cookiemilk
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
			//Taking number of test case from the user
			 //it should be only integer
			int testCase = input.nextInt();
	
			//while loop for interating number of test case
			//it runs upto test case	
	while(testCase>0){
	    testCase--;
		
		//taking size of the string array
	    int n = sc.nextByte(),i;
	    String s[] = new String[n];
		
		// storing string in array
	    for(i=0;i<n;i++){
	        s[i] = sc.next();
	    }
		
	    for(i=0;i<n-1;i++){
			
			//if value of adajacent string array is cookie then it will print NO
	        if(s[i].equals("cookie") && s[i+1].equals("cookie")){
	            break;
	        }
	    }
	    if(i < n-1 || s[n-1].equals("cookie")){
	        System.out.println("NO");
	    }
		
		//else it will print YES
	    else{
	        System.out.println("YES");
	    }
	}
	}
}