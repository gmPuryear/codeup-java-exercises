public class SyntaxTypesVariables {

    public static void main(String[] args) {

//        JS Variable Declaration
//        let something = value

//        Java Variable Declaration
//        datatype -> Name = value;

        byte daysOfMonth = 31;

        short employees = 10000;

        int userID = 1000000;

        long crcMilkWay = 100000000000L; // Needs L to specify as long

        float roundedPi = 3.14f;

        double someBigDecimal = 3.1415989;

        char yesNo = 'Y'; //Only time you can use single quotes is with chars

        boolean iLikeBeer = true;

        boolean iHatePizza = false;

        String myString = "Some string";

        // special chars

        String someQuote = "\"Some cliche quote\" - Mark Twain";
        System.out.println(someQuote);

        String backslashes = "i can do \\. Double backslash \\\\. And ... triple backslash \\\\\\";
        System.out.println(backslashes);

        System.out.print("\t" + "Hello");

        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";

        int sum = 1 + 1;
        System.out.print("\nThis is the sum: " + sum);

        double pi = 3.14259;
        System.out.println("\n Pi value is: " + pi * 2);

        System.out.println(++sum); // Returns 3. It increments and returns that value immediately

        System.out.println(sum++); // return

        sum = 4;

        sum += 5;

        System.out.println(sum);
    }
}
