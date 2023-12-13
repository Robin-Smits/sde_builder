public interface Email {
    void reset();

    void addressMr(String name);
    void addressMs(String name);
    void addressUnknown(String name);
    void introduceYourself(String name, String university);
    void showInterest(String company);
    void contactInfo();
    void thank();
    String getResult();
}
