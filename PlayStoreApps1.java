class PlayStoreApps1 {
//using static variable
    static String app1 = "Instagram";
    static String app2 = "Facebook";
    static String app3 = "Swiggu Delivary";
    static String app4 = "Whatsapp";

public static void main(String[] args) {
//usim local variable
        String app5 = "Youtube";
        String app6 = "Slice";
        String app7 = "Ring";
        String app8 = "Bejaan Trafic";

        String appNames[] = { app1, app2, app3, app4,app5, app6, app7, app8,"KUKU Fm", "Navi"  };

 System.out.println("Play Store Apps:");
        for (String apps : appNames) {
            System.out.println( apps);
        }
    }
}
