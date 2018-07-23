public class EX14 {
    public static void main(String[] args) {
        System.out.println("Main Function");
        int numberOfHyphens = 3;
        printHyphen(numberOfHyphens);
    }
    public static void printHyphen(int numberOfHYphens){
        System.out.println(numberOfHYphens);


        int counter = 0;
        while (counter< numberOfHYphens){
            System.out.print("-");
            counter = counter +1;
                }
    }

}

