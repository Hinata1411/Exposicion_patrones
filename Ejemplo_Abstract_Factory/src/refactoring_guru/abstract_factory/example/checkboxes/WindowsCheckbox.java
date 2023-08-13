package refactoring_guru.abstract_factory.example.checkboxes;
public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint(){
        System.out.println("Ha creado un CheckBox de Windows");
    }
}
