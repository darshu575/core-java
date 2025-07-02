class Hospital1 {
//using static variable
    static String doctor1 = "Dr Darshan";
    static String doctor2 = "Dr Sudeep";
    static String doctor3 = "Dr Bharat";
    static String doctor4 = "Dr Vishaws";
  public static void main(String[] args) {
  //using local variable
      String doctor5 = "Dr Simha";
        String doctor6 = "Dr Abhi";
        String doctor7 = "Dr Shivanna";
        String doctor8 = "Dr Tan";

 String doctorNames[] = {doctor1, doctor2, doctor3, doctor4, doctor5, doctor6, doctor7, doctor8,"Dr Surekha", "Dr Bhagya" };

 System.out.println("Doctors in Hospital:");
        for (String doctors : doctorNames) {
            System.out.println(doctors);
        }
    }
}
