public class DutchEmail implements Email {
    private String email = "";

    @Override
    public void reset() {
        this.email = "";
    }

    @Override
    public void addressMr(String name) {
        email += "Beste Mr." + name + ",";
        email += addNewLine();
        email += addNewLine();
    }

    @Override
    public void addressMs(String name) {
        email += "Beste Mv." + name + ",";
        email += addNewLine();
    }

    @Override
    public void addressUnknown(String name) {
        email += "Aan wie dit aan gaat,";
        email += addNewLine();
    }

    @Override
    public void introduceYourself(String name, String university) {
        email += "Mijn naam is " + name + " en ik ben recent geslaagd op de "+ university + ".";
        email += addNewLine();
    }

    @Override
    public void showInterest(String company) {
        email += "Ik email u om te informeren over een mogelijke internship bij " + company + ".";
        email += addNewLine();
        email += "Ik zou graag meer te weten willen komen.";
        email += addNewLine();
        email += "Laat het mij alstublieft weten als er internships beschikbaar zijn.";
        email += addNewLine();
    }

    @Override
    public void contactInfo() {
        email += "U kunt mij berijken via email of door te bellen";
        email += addNewLine();
    }

    @Override
    public void thank() {
        email += addNewLine();
        email += addNewLine();
        email += "Bedankt voor u tijd. Ik kijk er naar uit om van u te horen.";
    }

    @Override
    public String getResult() {
        return email;
    }

    private static String addNewLine() {
        return "\n\r";
    }
}
