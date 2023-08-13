package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Boton;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;
public interface GUIFactory {

    Boton crearBoton();
    Checkbox crearCheckbox();
}
