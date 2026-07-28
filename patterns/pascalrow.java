package patterns;

public class pascalrow{

	public static void main(String[] args){
		displaypascaltriangle(5);
	}

	public static void displaypascal(int n){
		int comb = 1;
		System.out.print(comb+"\t\t");

		for(int i =0;i<n;i++){
			comb  = comb  *(n-1)/(i+1);
			System.out.println(comb+"\t");
		}
	}

	public static void displaypascaltriangle(int n){
		int space = n;
		for(int i =0; i<=n;i++){
			for(int j = 1;j<=space;j++){
				System.out.print("/t");
			}
			displaypascal(i);
			space-=1;

			System.out.println();
		}
	}

	

	public static void main(String[] args){
		int n = 5;
		displaypattern(n);
	}
}