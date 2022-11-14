package ipl_teams;

public class MaxPointTeam {

	public static void main(String[] args) 
	{
		int temp = 0;
	
		int [] num  = {6,16,12,14,8,12,14,12,18};// Random Points of the teams
		
		System.out.println("Points of the teams is: ");
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<num.length; j++)
			{
				if(num[i]<num[j])
				{
				    temp = num[i];
				    num[i] = num[j];
				    num[j] = temp;
				    
				}
				
			}
		}	
		System.out.println();
		
		System.out.println("More Scorer points team is: ");
		for(int i=0; i<num.length; i++ )
		{
			System.out.print(num[i] + " ");
		}
		


	}

}
