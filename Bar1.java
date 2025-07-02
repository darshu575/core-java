class Bar1{
//using static variable
    static String alcohol1 = "MH";
    static String alcohol2 = "OT";
    static String alcohol3 = "IB";
    static String alcohol4 = "KingFisher";

public static void main(String[] args) {
//using local variable
        String alcohol5 = "OMR";
        String alcohol6 = "Black&White";
        String alcohol7 = "MomsMagic";
        String alcohol8 = "Star";
 String alcoholNames[] = {alcohol1, alcohol2, alcohol3, alcohol4,alcohol5, alcohol6, alcohol7, alcohol8,"BP", "Powercool", "BlackDog", "RoyalStag"};

        System.out.println("Available Alcohol Brands in the Bar:");
        for (String alcohols : alcoholNames) {
            System.out.println( alcohols);
        }
    }
}
