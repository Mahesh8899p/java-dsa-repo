import java.util.HashSet;
public class duplicate{
//we will user hashset in this
    public static boolean containDuplicates(int[] arr){
        HashSet<Integer> hashset = new HashSet<Integer>();
        for(int num : arr){
            if(hashset.contains(num)){
                return true;
            }
            hashset.add(num);
        }
        return false;

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(containDuplicates(arr));
    }
}