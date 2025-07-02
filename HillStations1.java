class HillStations1 {
//using static variable
    static String resort1 = "Shimla";
    static String resort2 = "Kasauli";
    static String resort3 = "Drass";
    static String resort4 = "RadissonBlu";

  public static void main(String[] args) {
  //using loacal variable
        String resort5 = "Della";
        String resort6 = "Vythiri";
        String resort7 = "Ananda";
        String resort8 = "Manali";

        String resort[] = {resort1, resort2, resort3, resort4, resort5, resort6, resort7, resort8,"XYZ"};
System.out.println("Hill Stations and Resorts:");
        for (String resortName : resort) {
            System.out.println(resortName);
        }
    }
}
