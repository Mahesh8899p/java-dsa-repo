package strings;

public class removealloccurence {
    static String removeChar(String s){
        StringBuilder st = new StringBuilder();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            if(c != ' '){
                st.append(c);
            }
        }
        return st.toString();
    }
}
