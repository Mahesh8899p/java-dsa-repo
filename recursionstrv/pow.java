package recursionstrv;

public class pow{
        public double myPow(double x, long n){
            long N = n;  //prevents overflowing
            if(N < 0){
                x = 1/x;
                N = -N;
            }

            return helper(x,N);

        }
        public double helper(double x, long n){
            if(n == 0){
                return 1;
            }

            double help = helper(x, n/2);
            if(n%2 == 0){
                return help*help;
            }
            else{
                return x*help*help;
            }
        }
}
