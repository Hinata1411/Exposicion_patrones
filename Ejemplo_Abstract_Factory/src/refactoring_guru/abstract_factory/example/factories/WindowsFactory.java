package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Boton;
import refactoring_guru.abstract_factory.example.buttons.WindowsBoton;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.example.checkboxes.WindowsCheckbox;
public class WindowsFactory implements GUIFactory {
    @Override
    public Boton crearBoton(){
        return new WindowsBoton();
    }
    @Override
    public Checkbox crearCheckbox(){
        return new WindowsCheckbox();
    }
}

