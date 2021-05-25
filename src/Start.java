import java.util.Scanner;

public class Start{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.print("Input values:");
            String line = scanner.nextLine();

            try {

                String[] symbols = line.split(" ");
                if (symbols.length != 3) throw new Exception("Incorrect values, try again");

                Number firstNumber = NumberAction.parseAndValidate(symbols[0]);
                Number secondNumber = NumberAction.parseAndValidate(symbols[2], firstNumber.getType());
                String result = Calculate.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Output value:" + result);

            } catch (Exception e) {

                System.out.println(e.getMessage());
                break;

            }

        }

        scanner.close();

    }

}

