public class average {
    public static void main(String[] args) {
        double[] arrSet = {30,10,15.2,29,47}; 
        double total = 0;

        for (int i = 0; i < arrSet.length; i++) {
            total += arrSet[i];
        }
        double average = total/arrSet.length;
        System.out.println("Average of given number is : " + average); 
    }

    
}
