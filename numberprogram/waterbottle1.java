package numberprogram;

public class waterbottle1 {
   public static void display(int totalbottles, int bottleexhangerate){
      int bottlesdrunk = totalbottles;
      int emptybottles = totalbottles;

      while(emptybottles >= bottleexhangerate){
        int newbottles = emptybottles/ bottleexhangerate;
        int remainingbottles = emptybottles % bottleexhangerate;
        
        bottlesdrunk += newbottles;
        emptybottles += remainingbottles;
      }
   }
}
