public class reverse{
    public static void main(String[] args) {
        int arm = 253; 
            int revers = 0;
while (arm != 0) {
    int removeLast = arm % 10;
    revers = revers*10+removeLast;
    arm /= 10;
}
System.out.println(revers);

    }
}
