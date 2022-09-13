public class DivModel extends CalcModel {
    @Override
    public ComplexNumber result() {
        ComplexNumber x = super.getX();
        ComplexNumber y = super.getY();
        try {
            double r = (x.rPart * y.rPart + x.cPart * y.cPart) /
                    (Math.pow(y.rPart, 2) + Math.pow(y.cPart, 2));
            double c = (x.cPart * y.rPart - x.rPart * y.cPart) /
                    (Math.pow(y.rPart, 2) + Math.pow(y.cPart, 2));
            ComplexNumber result = new ComplexNumber(r, c);
            Logging.writeEvent(Event.resultOperation, result.toString());
            return result;
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            Logging.writeEvent(Event.calcError, exception.getMessage());
            return null;
        }
    }

    public DivModel() {
        super.setOpType("Div: ");
    }
}
