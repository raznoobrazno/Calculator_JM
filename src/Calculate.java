public class Calculate {

    public static String calculate(Number firstN, Number secondN, String action) throws Exception {

        int result;

        if (action.equals("+")) result = firstN.getValue() + secondN.getValue();
        else if (action.equals("-")) result = firstN.getValue() - secondN.getValue();
        else if (action.equals("*")) result = firstN.getValue() * secondN.getValue();
        else if (action.equals("/")) result = firstN.getValue() / secondN.getValue();
        else {
            throw new Exception("Valid operations: '+, -, *, %'");
        }


        if (firstN.getType() == NumberType.ROMAN) {

            return NumberAction.toRomanNumber(result);

        } else return String.valueOf(result);

    }

}
