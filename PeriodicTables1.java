class PeriodicTables1 {
    static String element1 = "Nytrogen";
    static String element2 = "Helium";
    static String element3 = "Carbon";
    static String element4 = "Silicon";

public static void main(String[] args) {
        String element5 = "Sodium";
        String element6 = "Magnesium";
        String element7 = "Boron";
        String element8 = "Copper";

String elements[] = {element1, element2, element3, element4, element5, element6, element7, element8,"Chloride", "Bromide", "Lithiem", "Sulfur"};

System.out.println("Periodic Table Elements:");
        for (String elementName : elements) {
            System.out.println(elementName);
		}
}
}