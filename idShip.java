mport java.util.Scanner;



//**************Pseudo COde***************
	
	//Take number of tests as input - T
	//Perform all validity checks on T (1 ≤ T ≤ 100)
	//For a loop in range 0 to (T-1),
	
		//take chcater as user input
		
		//checkng if chacter is C of c
			//print BattleShip
			
		//checkng if chacter is D of d
			//print Destroyer
			
		//checkng if chacter is F of f
			//print Frigate
			
		//if apart from this chracter then print no ship found



public class ShipId {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			
			//Taking number of test case from the user
			 //it should be only integer
			int testCase = input.nextInt();
			
			
			//while loop for interating number of test case
			//it runs upto test case
		     while(testCase-->0)
		    	{  	
			
			
					//taking chracter from the user
				    char inputChracter = input.next().charAt(0);
					
					
					//checking if inputChracter = B OR b
					//if true print BattleShip
				    if(inputChracter=='B'||inputChracter=='b')
					{
						System.out.println("BattleShip"); 
					}
				    //checking if inputChracter = C OR c
					//if true print Cruiser
				    else if(inputChracter == 'C'||inputChracter == 'c')
					{
						System.out.println("Cruiser");
					} 
					
					//checking if inputChracter = D OR D
					//if true print Destroyer
				    else if(inputChracter =='D'|| inputChracter =='d'){
						System.out.println("Destroyer");
					} 
					
					//checking if inputChracter = F OR f
					//if true print Frigate
				    else if(inputChracter == 'F'|| inputChracter =='f'){
						System.out.println("Frigate");
						} 
						//then last it print no ship find
				    else{
						System.out.println("No Ship Class Found"); 
						}
		    	}

		} catch (Exception e) {
			 System.out.println(e);
		}
		
	     
	}

}