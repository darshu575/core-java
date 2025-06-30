class SuperMarket{
    static String iceCream[]= {"Amul","vanill","Arun","Strawberry","Lazza","ButterScotch","Blackcurrant","Chookies","FruitAndNut","ChocoChips"};
    static String perfumes[]= {"Fgg","Axe","Adidas","avon","DKNY","Jaguar","Chopard","Rasasi","Dove","SetWet"};
    static String groceries[]= {"Oil","Detergents","Coffee pudi","SoftDrinks","Cookies","HairCare","OralCare","Soaps","Colgates","Creams"};
    static String cosmetics[]= {"LipBamb","Lipstik","FacialMask","Mascara","EyeLiner","Shampoos","HairColor","Face Wash","Conditioners","perfumes"};
    public static void main(String[] args)
    {
       // System.out.println(iceCream[0]+"  "+iceCream[1]+"  "+iceCream[2]+"  "+iceCream[3]+"  "+iceCream[4]+"  "+iceCream[5]+"  "+iceCream[6]+"  "+iceCream[7]+"  "+iceCream[8]+"  "+iceCream[9]);
       // System.out.println(perfumes[0]+"  "+perfumes[1]+"  "+perfumes[2]+"  "+perfumes[3]+"  "+perfumes[4]+"  "+perfumes[5]+"  "+perfumes[6]+"  "+perfumes[7]+"  "+perfumes[8]+"  "+perfumes[9]);
       // System.out.println(groceries[0]+"  "+groceries[1]+"  "+groceries[2]+"  "+groceries[3]+"  "+groceries[4]+"  "+groceries[5]+"  "+groceries[6]+"  "+groceries[7]+"  "+groceries[8]+"  "+groceries[9]);
       // System.out.println(cosmetics[0]+"  "+cosmetics[1]+"  "+cosmetics[2]+"  "+cosmetics[3]+"  "+cosmetics[4]+"  "+cosmetics[5]+"  "+cosmetics[6]+"  "+cosmetics[7]+"  "+cosmetics[8]+"  "+cosmetics[9]);
   

			  for( String iceCreamName : iceCream)
			  {
			   System.out.println(iceCreamName);
			   }
			   
			   
			  for( String perfumeNames : perfumes)
			  {
			   System.out.println(perfumeNames);
			   }
			   
			   
			  for( String grocerieNames : groceries)
			  {
			   System.out.println(grocerieNames);
			   }

			  for( String cosmeticName: cosmetics)
			  {
			   System.out.println(cosmeticName);
			   }



   }}