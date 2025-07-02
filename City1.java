class City1 {
//using static variable
    static int pin1 = 577521;
    static int pin2 = 572106;
    static int pin3 = 586128;
    static int pin4 = 560040;
 public static void main(String[] args) {
        int pin5 = 560090;
        int pin6 = 560009;
        int pin7 = 562149;
        int pin8 = 560085;
 int pinCodes[] = { pin1, pin2, pin3, pin4,pin5, pin6, pin7, pin8,560105, 560060, 560078, 560001, 560017, 560066, 560043};
System.out.println("City PIN Codes:");
        for (int pinCode : pinCodes) {
            System.out.println(pinCode);
        }
    }
}
