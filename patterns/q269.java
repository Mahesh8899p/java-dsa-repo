//q269 
/*
3rd level important question for higher package in company 
*/
package patterns;

public class q269{

	public static void displaypattern(int n){
		if(n%2 == 0){
			System.out.println("Pattern is not possible");
			return;
		}
		int mid = n/2+1;
		int startSpace = n/2;
		int endStar = 5*n/2+1;
		for(int = 1;i<=n;i++){
			for(int j = 1;j<=mid;j++){ //section-1
				if(j<=startSpace){
					System.out.print("  ");
				}
				else{
					System.out.print("* ");
				}

				for(int j=mid+1;j<=n+1;j++){//section2
					if(i == 1 || j== n+1 &&  i<= mid){
						System.out.print("@ ");
					}
					else{
						System.out.print("  ");
					}
				}

				for(int j =n+2;j<=2*n-1;j++){//section 3
					if(i<mid){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}
				for(int j =2*n;j<=5*n/2;j++){//section 4
					if( i== 1 && j == 2*n && i<= mid){
						System.out.print("@ ");
					}
					else{
						System.out.print("  ");
					}
				}
				for(int j =5*n/2+1;j<=endStar;j++){//section 5
					if( i== 1 && j == 2*n && i<= mid){
						System.out.print("* ");
					}
					
				}
				if(i>mid){
					startSpace++;
				}
				else{
					startSpace--;
				}
				System.out.println();
			}


		}
	}
	public static void main(String[] args){

	}
}