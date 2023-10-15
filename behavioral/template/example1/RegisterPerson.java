package behavioral.template.example1;

public class RegisterPerson extends RegisterTemplate{
    @Override
    protected void identify(String identificationCode) {
        System.out.println("person identified successfully");

    }

    @Override
    protected void inquiry(String identificationCode) {
        System.out.println("person inquired successfully");

    }

    @Override
    protected void book(String identificationCode) {
        System.out.println("person booked successfully");

    }
}
