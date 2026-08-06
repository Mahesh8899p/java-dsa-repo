package numberprogram;

public class pratice {
    public static void display(int waterbottles , int exchangerate){
        int bottlesdrunk = waterbottles;
        int emptybottles = waterbottles;

        while(emptybottles >= exchangerate){
            int newbottles = emptybottles % exchangerate;
            int remainingbottles = emptybottles % exchangerate;


            bottlesdrunk += newbottles;
            emptybottles = newbottles+ remainingbottles;
        }
    }
}
