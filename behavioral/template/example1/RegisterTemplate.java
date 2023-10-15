package behavioral.template.example1;

public abstract class RegisterTemplate {

    public void register(String identificationCode){
        identify(identificationCode);
        inquiry(identificationCode);
        book(identificationCode);
    }

    protected abstract void identify(String identificationCode);
    protected abstract void inquiry(String identificationCode);
    protected abstract void book(String identificationCode);
}
