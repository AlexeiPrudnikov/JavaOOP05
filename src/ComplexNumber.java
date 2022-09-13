public class ComplexNumber {
    double rPart;
    double cPart;

    public double getRpart() {
        return rPart;
    }

    public void setRpart(double rPart) {
        this.rPart = rPart;
    }

    public double getCpart() {
        return cPart;
    }

    public void setCpart(double cPart) {
        this.cPart = cPart;
    }

    public ComplexNumber(double rPart, double cPart) {
        this.rPart = rPart;
        this.cPart = cPart;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(rPart);
        if (cPart >= 0) {
            stringBuilder.append("+");
        }
        stringBuilder.append(cPart);
        stringBuilder.append("i");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        ComplexNumber complexNumber = (ComplexNumber) obj;
        return (this.rPart == complexNumber.getRpart() && this.cPart == complexNumber.getCpart());
    }
}
