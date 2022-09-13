import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    List<String> menu = new ArrayList<>();
    private Map<Integer, String> menuMap = new HashMap<>();
    private Map<Integer, String> menuOperation = new HashMap<>();

    public View() {
        menuMap.put(1, "1. Сложение");
        menuMap.put(2, "2. Вычитание");
        menuMap.put(3, "3. Умножение");
        menuMap.put(4, "4. Деление");
        menuMap.put(5, "5. Выход");
        menuOperation.put(1, "+");
        menuOperation.put(2, "-");
        menuOperation.put(3, "*");
        menuOperation.put(4, "/");
        menuOperation.put(5, "exit");
    }

    public void printMenu() {
        for (Map.Entry<Integer, String> entry : menuMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public ComplexNumber getValue(String title) {
        System.out.printf("Действительная часть %s", title);
        double r = in.nextDouble();
        ComplexNumber result;
        System.out.printf("Мнимая часть %s", title);
        double c = in.nextDouble();
        result = new ComplexNumber(r, c);
        Logging.writeEvent(Event.getNumber, title + result.toString());
        return result;
    }

    public Model getOperaton() {
        Model result = null;
        printMenu();
        System.out.print("Выберите действие: ");
        Integer operation;
        do {
            operation = in.nextInt();
            if (menuOperation.get(operation) == null) {
                Logging.writeEvent(Event.choiceError, "Menu error");
                System.out.print("Ошибка ввода. Выберите действие: ");
            }
        } while (menuOperation.get(operation) == null);
        String op = menuOperation.get(operation);
        String message = "operation: ";
        if (op == null) return null;
        switch (op) {
            case "+":
                result = new SumModel();
                message += "+";
                break;
            case "-":
                result = new SubModel();
                message += "-";
                break;
            case "*":
                result = new MultModel();
                message += "*";
                break;
            case "/":
                result = new DivModel();
                message += "/";
                break;
            case "exit":
                Logging.writeEvent(Event.exit, "exit");
                return null;
        }
        Logging.writeEvent(Event.getOperation, message);
        return result;
    }

    public void print(ComplexNumber data, String title) {
        System.out.printf("%s %s\n", title, data.toString());
    }
}
