package homework12;

public class ConsoleCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please use next format expression as arguments - [number] space [operator('+' or '-' or '*' or '/')] space [number]");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]);
            String operatorSign = args[1];
            int result;

            switch (operatorSign) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0){
                        System.out.println("Nice try! Better luck next time =)");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Use only next operators for the operation sign: '+' or '-' or '*' or '/'");
                    return;
            }
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Use only integer numbers.");
        }
    }
}
