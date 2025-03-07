public class FindGrade {

    public static void main(String[] args) {
        //Get the score from the user as a file parameter
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F
        if(args.length == 1) {
            int score = Integer.parseInt(args[0]);
            if (100>score && score >= 90) {
                System.out.println("Grade: A");
            }else if (89> score && score >= 80) {
                System.out.println("Grade: B");
            }
            else if (79>score && score >= 70) {
                System.out.println("Grade: C");
            }else if (69>score && score >= 60) {
                System.out.println("Grade: D");
            }else if (59>score && score>=0) {
                System.out.println("Grade: F");
            }else {
                System.out.println("İnvalid Score");
            }
        } else {
            System.out.printf("Please provide a score");
        }
    }
}