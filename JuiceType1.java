class JuiceType1{
//using static variable
    static String juice1 = "Paludha";
    static String juice2 = "Orange";
    static String juice3 = "Mango";
    static String juice4 = "Apple";

public static void main(String[] args) {
//usinglocal variable
        String juice5 = "Chocolate";
        String juice6 = "Grape";
        String juice7 = "Pineapple";
        String juice8 = "Watermilon";

        String juices[] = {juice1, juice2, juice3, juice4, juice5, juice6, juice7, juice8, "Papaya", "Chikku", "Banana", "Pista", "DragonFruite", "MintLime", "Mosambi" };

  System.out.println("Available Juice Types:");
        for (String juiceName : juices) {
            System.out.println( juiceName);
        }
    }
}
