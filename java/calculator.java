public class calculator {
   static int add(int num1 , int num2) {
       int sum =  num1 + num2;
       return sum;
   }

   static int sub(int num1 , int num2) {
    int sub =  num1 - num2;
    return sub;
}
static int multiply(int num1 , int num2) {
    int multiply =  num1 * num2;
    return multiply;
}
static int divide(int num1 , int num2) {
    int divide =  num1 / num2;
    return divide;
}

   public static void main(String[] args) {
       
       int totalAdd = add(2,3);
       int totalSub = sub(22,3);
       int totalMulti = multiply(2,3);
       int totalDiv = divide(20,2);

       System.out.println("Addition : "+ totalAdd);
       System.out.println("Subtraction : "+ totalSub);
       System.out.println("Multiplication : "+ totalMulti);
       System.out.println("Division : "+ totalDiv);

   }
}
