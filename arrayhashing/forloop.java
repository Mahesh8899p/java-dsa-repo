package arrayhashing;
public class forloop{
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        //[1,2,3]
        //   i<=3 
        // i< n = 3 ; i+=1
        //arr[0]
        int n = arr.length;
        for(int i = 0; i<=n;i++){
            System.out.println(arr[i]);
        }
    }
}