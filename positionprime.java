class positionprime{

    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        int i = 2;
        while(count < n){
            if(isPrime(i)){
                count++;
            }
            i++;
        }
        System.out.println("The " + n + "th prime number is " + i);
    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
} 
