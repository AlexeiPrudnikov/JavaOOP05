import java.util.List;

public class Presenter {
    View view;
    Model model;
    String operation;

    public Presenter(View v) {
        view = v;
    }

    public void start() {
        model = view.getOperaton();
        while (model != null) {
            ComplexNumber a = view.getValue("a: ");
            ComplexNumber b = view.getValue("b: ");
            model.setX(a);
            model.setY(b);

            ComplexNumber result = model.result();
            view.print(result, model.getOpType());
            model = view.getOperaton();
        }
    }

}
