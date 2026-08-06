package numberprogram;

public class waterbottle2 {
    public static void display(int totalbottles, int exchangebottlerate){
        int bottlesdrunk = totalbottles;
        int emptybottles = totalbottles;

        while(emptybottles > exchangebottlerate){
            emptybottles -= exchangebottlerate;
            emptybottles+=1;
            bottlesdrunk-=1;
            exchangebottlerate+=1;
            
        }
    }
}
