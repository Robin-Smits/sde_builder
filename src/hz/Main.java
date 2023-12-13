
public class Main {

    public static void main(String[] args) {
        ConsoleWriter writer = new ConsoleWriter();
        //EnglishEmail builder = new EnglishEmail();
        DutchEmail builder = new DutchEmail();
        Director director = new Director(builder);
        String email = director.makeEmail();

        writer.writeLine(email);
    }
}
