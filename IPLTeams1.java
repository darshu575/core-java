class IPLTeams1 {
	
	//using static variables
    static String team1 = "CSK";
    static String team2 = "SRH";
    static String team3 = "RR";
    static String team4 = "GT";

    public static void main(String[] args) {
		//using local variables
        String team5 = "MI";
        String team6 = "PBKS";
    String team7 = "LSG";
String team8 = "DC";

        String teamNames[] = { team1, team2, team3, team4,team5, team6, team7, team8, "SRH", "RCB" };

 System.out.println("IPL Teams:");
        for (String teams : teamNames) {
            System.out.println(teams);
        }
    }
}
