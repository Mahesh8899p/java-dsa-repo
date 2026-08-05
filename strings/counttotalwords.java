package strings;

public class counttotalwords {
    public static int countwords(String name){
        int count = 0;
        boolean insideword = false;
        int n = name.length();
        for(int i = 0; i<n;i++){
            char c = name.charAt(i);

            if( c != ' '){
                if(!insideword){
                    count++;
                    insideword = true;
                }
            }
            else{
                insideword = false;
            }
        }
        return count;
    }
}
