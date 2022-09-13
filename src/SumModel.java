public class SumModel extends CalcModel {

    public ComplexNumber result() {
        ComplexNumber x = super.getX();
        ComplexNumber y = super.getY();
        ComplexNumber result = new ComplexNumber(x.rPart + y.rPart, x.cPart + y.cPart);
        Logging.writeEvent(Event.resultOperation, result.toString());
        return result;
    }

    public SumModel() {
        super.setOpType("Sum: ");
    }
}
