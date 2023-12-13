public class Director {
    private Email email;
    public Director(Email email) {
        this.email = email;
    }

    public String makeEmail() {
        this.email.reset();
        this.email.addressMr("Kees");
        this.email.introduceYourself("Robin", "HZ");
        this.email.showInterest("<Set-Company>");
        this.email.contactInfo();
        this.email.thank();
        return(this.email.getResult());

    }
}
