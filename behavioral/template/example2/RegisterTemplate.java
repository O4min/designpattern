package behavioral.template.example2;

public abstract class RegisterTemplate {

    private Rule identify;
    private Rule inquiry;
    private Rule book;

    public RegisterTemplate(Rule identify, Rule inquiry, Rule book) {
        this.identify = identify;
        this.inquiry = inquiry;
        this.book = book;
    }

    public void register(){
        identify.check();
        inquiry.check();
        book.check();
    }
}
