package behavioral.template.example1;

public class RegisterEmployee extends RegisterPerson {

    @Override
    public void register(String identificationCode) {
        System.out.println("registering a employee");
        super.register(identificationCode);
    }
}
