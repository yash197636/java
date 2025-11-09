public class xyz {
    
    public static void main(String[] args) {
        try{
        int result = 5/0;
        System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println("Sorry you cant divide by zero");
        }
    }
}
