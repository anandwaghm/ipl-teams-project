package ipl_teams;
import java.util.ArrayList;

public class Performance {

	public static void main(String[] args) 
	{
		ArrayList<Object> a1 = new ArrayList<Object>();
		
		a1.add(new Teams("LSG", 18, 3, 2));
		a1.add(new Teams("RR", 16, 3, 2));
		a1.add(new Teams("DC", 14,2,3));
		a1.add(new Teams("RCB", 14,3,2));
		a1.add(new Teams("KKR", 12,3,2));
		a1.add(new Teams("PBKS", 12,2,3));
		a1.add(new Teams("SRH", 12,1,4));
		a1.add(new Teams("CSK", 8,2,3));
		a1.add(new Teams("MI", 6,3,2));
		
		System.out.println(a1);
		
		int least = 100;
		int index = 0;
		
		for(int i=0; i<a1.size(); i++)
		{
			Teams t1 = (Teams)a1.get(i);
			
			if(t1.lossingmatches<least)
			{
				least = t1.lossingmatches;
				index = a1.indexOf(t1);
				System.out.println("The more Scorer team is: ");
			}
			
			else if(t1.winingmatches<least)
			{
				least = t1.winingmatches;
				index = a1.indexOf(t1);
				System.out.println("The least Scorer team is: ");
			}
			
			
			Teams t2 = (Teams)a1.get(index);
			
			t2.displayteams();
			System.out.println("Thanks for participating in Ipl playing very well and Best Luck for Future!!");
			
			a1.remove(index);
			System.out.println(a1);
			System.out.println();
			
		}

	}

}

/*Algorithm for given problem Statement
 Input: Create an object of Arraylist and pass values in it.
 Output: Result are getting in the form of object
 Step 1:  Start 
 Step 2: Passing two integer Values 
         1. int least - This integer value is used for comparison between two values
         2. int index - The index is used from accessing the values starts from 0 to size-1.
         
  Step 3: using control looping statement reach each and every value from start to end.
  Step 4: using decision statement  getting more scorer team and less scorer team values.
          
          if(t1.lossingmatches<least)
			{
				least = t1.lossingmatches;
				index = a1.indexOf(t1);
				System.out.println("The more Scorer team is: ");
			}
			
			else if(t1.winingmatches<least)
			{
				least = t1.winingmatches;
				index = a1.indexOf(t1);
				System.out.println("The least Scorer team is: ");
			} 
			
	Step 5: using decision statement filter the wining and lossing team and getting information about  two consecutive wins/loss.
	Step 6: Display the result (Information about points achieved by teams and no of losses and wins)
	Step 7: Remove the team has less number of points and wins.
*/
