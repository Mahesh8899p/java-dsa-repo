package clsquestions;


public static int displaysum(int n){
    int sum =0;
        while(num > 9){
            while(num >0){
                sum = sum + num%10;
                num/=10;
            }
            num = sum;
        }
        return num;
    }

