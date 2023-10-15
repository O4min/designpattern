package behavioral.template.example1;

public class RegisterCompany extends RegisterTemplate{
    @Override
    protected void identify(String identificationCode) {
        System.out.println("company identified successfully");
    }

    @Override
    protected void inquiry(String identificationCode) {
        System.out.println("company inquired successfully");
    }

    @Override
    protected void book(String identificationCode) {
        System.out.println("company booked successfully");
    }
}
