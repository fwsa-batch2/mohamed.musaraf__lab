 public class main{
  public static void main(String[] args){
    System.out.println("hello hasan");
    String name = "musaraf";
    System.out.println(name);
    int phoneNumber = 908064;
    System.out.println(phoneNumber);
    String lastName;
    lastName = "mohamed";
    System.out.println(lastName);
    int value1 = 3,value2 = 5,value3 = 8;
    System.out.println(value1+value2+value3);

    // factorial
    int num = 7;
    int factNum = 1;
    
    for (int i = 1; i <= num; ++i) {
      factNum *= i;
    }
    System.out.println("factorial of num 7 = " +factNum);

    // Fibonacci Series

int fibNum =10, firstNum = 0, secNum = 1; 

for (int i = 1; i <= fibNum; ++i){
  System.out.print(firstNum + ", ");

  int nextNum = firstNum + secNum;
  firstNum = secNum;
  secNum = nextNum;
}

  }

}


