

public class Except {
    public static void main(String[] args) {
        try{
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
    
        }
        catch(Exception e){
            System.out.println("sorry for this inconvenience");
 
        }
        finally{
            System.out.println("myNumbers");

        }
      }
}
