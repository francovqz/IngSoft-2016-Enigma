package headfirst.combined.djview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyAnotadorControllerTest {
    @Before
    public void method(){
        System.setProperty("java.awt.headless", "false");
    }

    @Test
    public void increaseBPM() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);//
        clase.setJUG2(4);
        controlador.increaseBPM();
        assertEquals(5,clase.getJUG2());
    }
    @Test
    public void increaseBPM2() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);//
        clase.setJUG2(-3);
        controlador.increaseBPM();
        assertEquals(-2,clase.getJUG2());
    }

    @Test
    public void decreaseBPM() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);//
        clase.setJUG1(3);
        controlador.decreaseBPM();
        assertEquals(4,clase.getJUG1());
    }
    @Test
    public void decreaseBPM2() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);//
        clase.setJUG1(-1);
        controlador.decreaseBPM();
        assertEquals(0,clase.getJUG1());
    }

    @Test
    public void setBPM() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);//
        controlador.setBPM(30);
        assertEquals(30,clase.getBPM());
    }
    @Test
    public void metodosInterface() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);
        controlador.view.updateBPM();
        controlador.view.updateBeat();
        controlador.view.updateJUG1();
        controlador.view.updateJUG2();
        controlador.view.desregistrar();
        controlador.view.registrar();
        controlador.start();
        controlador.stop();
        assertEquals(clase,controlador.model);
    }

    @Test
    public void constructor() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);
        MyAnotadorController controlador2= new MyAnotadorController(clase,controlador.view);
        assertEquals(controlador.view,controlador2.view);
    }
}