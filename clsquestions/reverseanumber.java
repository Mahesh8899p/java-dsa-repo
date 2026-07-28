package clsquestions;

public static void displayreverse(int n){
    int num = n;
        if(n<0){
            n = -n;
        }
        int rev = 0;
    while(n>0){
        
        rev = 10 * rev + n % 10;
        n/=10;
    }
    if(num < 0){
        rev=-rev;
    }
    return rev;
} 


