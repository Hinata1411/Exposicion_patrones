package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Boton;
import refactoring_guru.abstract_factory.example.buttons.MacOsBoton;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.example.checkboxes.MacOsCheckbox;
public class MacOsFactory implements GUIFactory {
    @Override
    public Boton crearBoton(){
        return new MacOsBoton();
    }
    @Override
    public Checkbox crearCheckbox(){
        return new MacOsCheckbox();
    }
}
