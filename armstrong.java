public class armstrong {
    public static void main(String[] args) {
        int n=110,sum=0;
        while(n>0){
            int digit=n%10;
            int cube=digit*digit*digit;
            sum=sum+cube;
            n=n/10;
        }
        if(n==sum){
            System.out.println("ARMSTRONG");
        }
        else{
            System.out.println("not an armstrong");
        }

    }
    
}
