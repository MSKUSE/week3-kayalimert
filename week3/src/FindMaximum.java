public class FindMaximum {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        boolean condiditon = num1 > num2;
        int max = condiditon ? num1 : num2;
        System.out.println(max);




        int number1=Integer.parseInt(args[0]);
        int number2=Integer.parseInt(args[1]);
        if (number1>number2) {
            System.out.println("Number1 is maximum");
        }else if (number1<number2) {
            System.out.println("Number2 is maximum");
        }else if (number1==number2) {
            System.out.println("Number1 and Number2 is equal");
        }

    }
}
