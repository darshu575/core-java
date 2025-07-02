class PlayStation1 {
    static String game1 = "BGMI";
    static String game2 = "Freefire";
    static String game3 = "Ludo";
    static String game4 = "Kabadi";

    public static void main(String[] args) {
        String game5 = "GTA";
        String game6 = "CallOfDuty";
        String game7 = "Cricket";
       String game8 = "Kho-Kho";

        String games[] = {game1, game2, game3, game4,game5, game6, game7, game8, "Rummy", "TempleRun" };

  System.out.println("Games in PlayStation:");
      for (String gameName : games) {
            System.out.println( gameName);
        }
    }
}
