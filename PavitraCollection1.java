class PavitraCollection1{
    static String brand1 = "Zudio";
    static String brand2 = "Sport";
    static String brand3 = "Boss";
    static String brand4 = "Crocs";
 public static void main(String[] args) {
        String brand5 = "Dollor";
        String brand6 = "Adidas";
 String brands[] = {brand1, brand2, brand3, brand4,brand5, brand6,"XYZ"};

System.out.println("Pavitra Collection Brands:");
        for (String brandName : brands) {
            System.out.println( brandName);
        }
    }
}
