class MathMethods{

    public static void Main(String[]args){

    }

    //checks if int n is a prime num
    public boolean isPrime(int n){
        if(n == 2)
            return true;
        // int divisions doesn't matter, if num is odd can't be divisable by two
        for(int i = 2; i < n/2; i++){
           if(n%i == 0)
                 return false;
    }
        return true;
    }

    
}