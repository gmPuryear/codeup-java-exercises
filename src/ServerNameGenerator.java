import java.util.concurrent.ThreadLocalRandom;

public class ServerNameGenerator {
    static String[] adjectivesArr = {"blue", "green", "big", "small", "bright", "dark", "rough", "soft", "round", "fluffy"};
    static String[] nounsArr = {"cup", "straw", "c4", "shoes", "apple", "shirt", "pants", "watch", "New York", "Austin"};

    public static String returnRandomArrayElement(String[] stringArray) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, stringArray.length - 1);
        return stringArray[randomNum];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(returnRandomArrayElement(nounsArr)+ " - " + returnRandomArrayElement(adjectivesArr));

    }

}
