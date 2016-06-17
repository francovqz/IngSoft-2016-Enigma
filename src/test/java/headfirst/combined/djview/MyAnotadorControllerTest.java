package headfirst.combined.djview;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyAnotadorControllerTest {
    @Test
    public void increaseBPM() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);
        clase.setJUG2(4);
        controlador.increaseBPM();
        assertTrue(clase.getJUG2()==5);
    }
    @Test
    public void increaseBPM2() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);
        clase.setJUG2(-3);
        controlador.increaseBPM();
        assertTrue(clase.getJUG2()==-2);
    }

    @Test
    public void decreaseBPM() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);
        clase.setJUG1(3);
        controlador.decreaseBPM();
        assertTrue(clase.getJUG1()==4);
    }
    @Test
    public void decreaseBPM2() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);
        clase.setJUG1(-1);
        controlador.decreaseBPM();
        assertTrue(clase.getJUG1()==0);
    }

    @Test
    public void setBPM() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);
        controlador.setBPM(30);
        assertTrue(clase.getBPM()==30);
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
    public void constructor() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorController controlador= new MyAnotadorController(clase);
        MyAnotadorController controlador2= new MyAnotadorController(clase,controlador.view);
        assertEquals(controlador,controlador2);
    }
}