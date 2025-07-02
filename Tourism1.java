class Tourism1 {
    static String place1 = "Chirtradurga";
    static String place2 = "Hampi";
    static String place3 = "Gokarna";
    static String place4 = "Goa";

    public static void main(String[] args) {
        String place5 = "Dandeli";
        String place6 = "Nayagara Falls";
        String place7 = "Murudeshwar";
        String place8 = "NandiHills";

        String touristPlaces[] = { place1, place2, place3, place4,  place5, place6, place7, place8,  "Udupi", "Ladak", "DD Hills", "CubbonPark", "Sakaleshpur", "Belur", "Halebeedu"
        };

      
         for( String  places: touristPlaces)
      {
	    System.out.println(places);
        }
    }
}
