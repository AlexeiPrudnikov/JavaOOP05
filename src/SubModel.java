public class SubModel extends CalcModel {

    @Override
    public ComplexNumber result() {
        ComplexNumber x = super.getX();
        ComplexNumber y = super.getY();
        ComplexNumber result = new ComplexNumber(x.rPart - y.rPart, x.cPart - y.cPart);
        Logging.writeEvent(Event.resultOperation, result.toString());
        return result;
    }

    public SubModel() {
        super.setOpType("Sub: ");
    }
}
