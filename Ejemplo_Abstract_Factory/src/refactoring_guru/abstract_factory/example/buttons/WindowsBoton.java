package refactoring_guru.abstract_factory.example.buttons;

public class WindowsBoton implements Boton {

        @Override
    public void paint(){
            System.out.println("Ha creado un botón Windows");
        }
}
