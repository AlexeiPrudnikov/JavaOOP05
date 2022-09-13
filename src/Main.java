public class Main {
    public static void main(String[] args) {

        View v = new View();
        Presenter p = new Presenter(new View());
        p.start();


    }
}