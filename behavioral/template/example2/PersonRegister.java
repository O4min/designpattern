package behavioral.template.example2;

public class PersonRegister extends RegisterTemplate{
    public PersonRegister(Person person) {
        super(person::identify, person::inquiry, person::book);
    }
}
