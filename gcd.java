

public class gcd {
    static int gcd(int a,int b){

        int min=Math.min(a,b);
        for(int i=min;i>=1;i--) {
            if(a%i==0 && b%i==0)
            return i;
        }
        return 1;
    }
        public static void main(String[]args){
            int x=10,y=15;
            int res =gcd(x,y);
            System.out.println(res);

        }
    }


