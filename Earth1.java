class Earth1 {

//using static variable

    static String continent1 = "Africa";
    static String continent2 = "Asia";
    static String continent3 = "Antarctica";
    static String continent4 = "SouthAmerica";

    public static void main(String[] args) {
	
//using local variable
        String continent5 = "NorthAmerica";
        String continent6 = "Europe";
        String continent7 = "Oceania";
        

        String continents[] = { continent1, continent2, continent3, continent4,continent5, continent6, continent7,};

 System.out.println("Continents of the Earth:");
        for (String continentName : continents) {
            System.out.println(continentName);
        }
    }
}
