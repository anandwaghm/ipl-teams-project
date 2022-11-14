package ipl_teams;

import java.util.*;
public class AveragePoints {

	public static void main(String[] args) 
	{
		int sum =0; int Average;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers of teams:");
		int teamsize = sc.nextInt();
		
		int [] a = new int[teamsize];
		
		System.out.println("Enter the points of the team:");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
			
			sum = sum + a[i];
		}
		System.out.println("The sum of points of teams is: "+sum);
		Average = (int)sum/teamsize;
		
		System.out.println("The Average of team points are: "+Average);
		
		

	}

}
