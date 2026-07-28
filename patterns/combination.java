public class combination{
//pascal triangle 1 and 2 on leetcode 
	public static int getCombination(int n, int ){
		if(r>n){
			return 0;
		}
		int comb = 1;
		for(int i = 0;i<r;i++){
			comb = comb * (n-1)/i+1;
			System.out.println(comb+" ");
		}
	}
}