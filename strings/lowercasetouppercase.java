package strings;

public class lowercasetouppercase {
    public static void lowercasetouppercase(String s){
        StringBuilder st = new StringBuilder();
        int n = s.length();
        for(int i = 0; i<n;i++){
            char c = s.charAt(i);
            //lowercase to uppercase
            if(c >= 'a' && c <= 'z'){
                c = (char) (c - 32);
                st.append(c);
            }
            //uppercase to lowercase
            else if(c >= 'A' && c <= 'Z'){
                c = (char) (c+32);
                st.append(c);
            }
            else{
                st.append(c);
                
            }
            
        }
    }
}
