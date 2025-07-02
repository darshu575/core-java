class Bangalore1{
    static String area1 = "Kalasi palya";
    static String area2 = "Basham circle";
    static String area3 = "Vijaya Nagara";
    static String area4 = "Rajajinagara";

    public static void main(String[] args) {
        String area5 = "Hebbal";
        String area6 = "Yalanka";
        String area7 = "BTM Layout";
        String area8 = "Indiranagar";

        String areaNames[] = {area1, area2, area3, area4, area5, area6, area7, area8,"HSR layout","Shivajinagar"};

 System.out.println("Areas in Bangalore:");
        for (String areas : areaNames) {
            System.out.println(areas);
        }
    }
}
