package refactoring_guru.abstract_factory.example.app;

import refactoring_guru.abstract_factory.example.buttons.Boton;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.example.factories.GUIFactory;

public class Application {
    private Boton boton;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        boton = factory.crearBoton();
        checkbox = factory.crearCheckbox();
    }

    public void paint() {
        boton.paint();
        checkbox.paint();
    }
}


