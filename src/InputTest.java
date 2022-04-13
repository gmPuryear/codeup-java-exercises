import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println(userInput.getString());

        Input yesNoInput = new Input();
        System.out.println(yesNoInput.yesNo());

        Input minMax = new Input();
        minMax.getIntRange(1, 10);

        Input userEntersDouble = new Input();
        userEntersDouble.getDoubleRange(50, 60);


    }
}
