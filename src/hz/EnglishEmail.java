public class EnglishEmail implements Email {
    private String email = "";
    @Override
    public void reset() {
        this.email = "";
    }

    @Override
    public void addressMr(String name) {
        email += "Dear Mr." + name + ",";
        email += addNewLine();
        email += addNewLine();
    }

    @Override
    public void addressMs(String name) {
        email += "Dear Ms." + name + ",";
        email += addNewLine();
    }

    @Override
    public void addressUnknown(String name) {
        email += "To who it may concern,";
        email += addNewLine();
    }

    @Override
    public void introduceYourself(String name, String university) {
        email += "My name is " + name + " and I'm a recent graduate of "+ university + ".";
        email += addNewLine();
    }

    @Override
    public void showInterest(String company) {
        email += "I'm emailing you to ask about a potential interning opportunity at " + company + ".";
        email += addNewLine();
        email += "I’d love to learn more about.";
        email += addNewLine();
        email += "Please let me know if you have any internships available.";
        email += addNewLine();
    }

    @Override
    public void contactInfo() {
        email += "You can reach me via email or on my cell phone.";
        email += addNewLine();
    }

    @Override
    public void thank() {
        email += addNewLine();
        email += addNewLine();
        email += "Thank you so much for your time. I really look forward to hearing from you.";
    }

    @Override
    public String getResult() {
        return email;
    }

    private static String addNewLine() {
        return "\n\r";
    }
}
