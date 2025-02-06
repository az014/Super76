public class vowels {
    public static void main(String[]args){
        String a="shiji";
        switch(a){
            case "aeiou":
            System.out.println("vowels");
            break;
            case "AEIOU":
            System.out.println("caps vowels");
            break;
            default:
            System.out.println("not a vowels");
        }
    }
    
}
