package refactoring_guru.abstract_factory.example.checkboxes;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void paint(){
        System.out.println("Ha creado un CheckBox de MacOs");
    }
}
