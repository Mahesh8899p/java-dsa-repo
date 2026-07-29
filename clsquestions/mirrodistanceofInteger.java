package clsquestions;
class mirrordistanceofInteger{
    public int mirrorDistance(int n) {
        int rev = 0;
        int num = n;
        while(n>0){
            rev = 10* rev + n % 10;
            n/=10;
        }
        int mirrorDistance = num-rev;
        if(mirrorDistance < 0){
            mirrorDistance=-mirrorDistance;
        }

        return mirrorDistance;
    }
}