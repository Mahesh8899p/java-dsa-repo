public class reversethewords{
    public static String reversethewords(String s){
        String[] words = s.split(" ");
        StringBuilder st = new StringBuilder();

        for(String word : words){
            StringBuilder reversed = new StringBuilder(word).reverse();
            st.append(reversed);
            st.append(" ");
        }

        return st.toString().trim();
    }
}

//hello world
//olleh dlrow