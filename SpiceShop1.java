class SpiceShop1 {
    static String spice1 = "Gobi";
    static String spice2 = "Egg Rice";
    static String spice3 = "Chilli Chikken";
    static String spice4 = "Kababu";

    public static void main(String[] args) {
        String spice5 = "Cloves";
        String spice6 = "Cardamom";
        String spice7 = "CaromSeeds";
        String spice8 = "Coriander";

        String spices[] = {
            spice1, spice2, spice3, spice4,
            spice5, spice6, spice7, spice8,
            "CuminSeeds", "Bayleaf", "Nutmeg", "BlackSalt", "DryJinger", "Turmeric" };

   for( String spiceNames : spices)
      {
	    System.out.println(spiceNames);
            
        }
    }
}
