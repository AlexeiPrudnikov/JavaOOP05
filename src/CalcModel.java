public abstract class CalcModel implements Model {
    private ComplexNumber x;
    private ComplexNumber y;
    private String opType;

    @Override
    public void setX(ComplexNumber x) {
        this.x = x;
    }

    @Override
    public void setY(ComplexNumber y) {
        this.y = y;
    }

    public ComplexNumber getX() {
        return x;
    }

    public ComplexNumber getY() {
        return y;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getOpType() {
        return opType;
    }
}
