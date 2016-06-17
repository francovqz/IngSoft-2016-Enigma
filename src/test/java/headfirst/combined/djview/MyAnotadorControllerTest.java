package headfirst.combined.djview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyAnotadorControllerTest {

    @Test
    public void increaseBPM() throws Exception {
        MyAnotadorModel clase1= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase1);
        clase1.setJUG2(4);
        controlador.increaseBPM();
        assertEquals(5,clase1.getJUG2());
    }
    @Test
    public void increaseBPM2() throws Exception {
        MyAnotadorModel clase2= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase2);
        clase2.setJUG2(-3);
        controlador.increaseBPM();
        assertEquals(-2,clase2.getJUG2());
    }

    @Test
    public void decreaseBPM() throws Exception {
        MyAnotadorModel clase3= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase3);
        clase3.setJUG1(3);
        controlador.decreaseBPM();
        assertEquals(4,clase3.getJUG1());
    }
    @Test
    public void decreaseBPM2() throws Exception {
        MyAnotadorModel clase4= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase4);
        clase4.setJUG1(-1);
        controlador.decreaseBPM();
        assertEquals(0,clase4.getJUG1());
    }

    @Test
    public void setBPM() throws Exception {
        MyAnotadorModel clase5= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase5);
        controlador.setBPM(30);
        assertEquals(30,clase5.getBPM());
    }
    @Test
    public void metodosInterface() throws Exception {
        MyAnotadorModel clase6= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase6);
        controlador.view.updateBPM();
        controlador.view.updateBeat();
        controlador.view.updateJUG1();
        controlador.view.updateJUG2();
        controlador.view.desregistrar();
        controlador.view.registrar();
        controlador.start();
        controlador.stop();
        assertEquals(clase6,controlador.model);
    }

    @Test
    public void constructor() throws Exception {
        MyAnotadorModel clase7= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase7);
        MyAnotadorController controlador2= new MyAnotadorController(clase7,controlador.view);
        assertEquals(controlador.view,controlador2.view);
    }
}