
public class Main {

    public static void main(String[] args) {

        //
        ConsoleWriter writer = new ConsoleWriter();

        // Let's construct an email
        String email = "";

        // address
        String name = "<Set-Name>";

        email += "Dear Mr." + name + ","; // address a sir
//        email += "Dear Ms." + name + ","; // address a madam
//        email += "To who it may concern,"; // to unknown
        email += addNewLine();

        // introduce yourself
        String university = "HZ University of Applied Sciences";

        email += "My name is " + name + " and I'm a recent graduate of "+ university + ".";
        email += addNewLine();

        // show my interest
        String company = "<Set-Company>";

        email += "I'm emailing you to ask about a potential interning opportunity at " + company;
        email += " I’d love to learn more about. Please let me know if you have any internships available.";
        email += addNewLine();

        // tell how to contact
        email += "You can reach me via email or on my cell phone.";
        email += addNewLine();

        // say thanks
        email += addNewLine();
        email += addNewLine();
        email += "Thank you so much for your time. I really look forward to hearing from you.";

        writer.writeLine(email);
    }

    private static String addNewLine() {
        return "\n\r";
    }
}
