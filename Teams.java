package ipl_teams;

public class Teams {

		String teamname;
		int teampoints;
		int winingmatches;
		int lossingmatches;
		
		Teams()
		{
			// default constructor
		}
		
		Teams(String teamname,int teampoints,int winingmatches,int lossingmatches)
		{
			super();
			this.teamname = teamname;
			this.teampoints = teampoints;
			this.winingmatches = winingmatches;
			this.lossingmatches = lossingmatches;
		}
		
		public void displayteams()
		{
			System.out.println("Teamname: "+teamname);
			System.out.println("Teampoints: "+teampoints);
			System.out.println("Winingmatches: "+winingmatches);
			System.out.println("Lossingmatches: "+lossingmatches);
		}
		
		public String toString()
		{
			return "[Teamname: "+teamname+", Teampoints: "+teampoints+", Winingmatches: "+winingmatches+", Lossingmatches: "+lossingmatches+"]";
		}
	

}
