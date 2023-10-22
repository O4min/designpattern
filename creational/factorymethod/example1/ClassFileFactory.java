package creational.factorymethod.example1;

/**
 * Author: A.Hosseini
 * Date:10/22/2023
 * Time:5:21 PM
 */
public class ClassFileFactory {

    public ClassFile create(final ProgrammingLang lang) {
        return switch (lang) {
            case CPP -> new CPPClassFile();
            case JAVA -> new JavaClassFile();
            case PYTHON -> new PythonClassFile();

        };
    }
}
