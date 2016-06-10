package headfirst.combined.djview;

public class MyAnotadorTestDrive {
    public static void main (String[] args) {
        MyAnotadorModel anotador = new MyAnotadorModel();
      ControllerInterface model = new MyAnotadorController(anotador);
    }
}
