public class MultModel extends CalcModel {

    @Override
    public ComplexNumber result() {
        ComplexNumber x = super.getX();
        ComplexNumber y = super.getY();
        double r = x.rPart * y.rPart - x.cPart * y.cPart;
        double c = x.rPart * y.cPart + x.cPart * y.rPart;
        ComplexNumber result = new ComplexNumber(r, c);
        Logging.writeEvent(Event.resultOperation, result.toString());
        return result;
    }

    public MultModel() {
        super.setOpType("Mult: ");
    }
}
