package headfirst.combined.djview;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyAnotadorAdapterTest {
    @Test
    public void getName() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorAdapter adapter= new MyAnotadorAdapter(clase);

    }

    @Test
    public void mettodosInterface() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorAdapter adapter= new MyAnotadorAdapter(clase);
        adapter.initialize();
        adapter.on();
        adapter.off();
        adapter.setJUG1(2);
        adapter.setJUG2(1);
        assertEquals(adapter.anotador,clase);
    }


    @Test
    public void setBPM() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorAdapter adapter= new MyAnotadorAdapter(clase);
        adapter.setBPM(10);
        assertEquals(10,adapter.getBPM());
    }


    @Test
    public void getJUG1() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorAdapter adapter= new MyAnotadorAdapter(clase);
        clase.setJUG1(5);
        assertEquals(5,adapter.getJUG1());
    }

    @Test
    public void getJUG2() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        MyAnotadorAdapter adapter= new MyAnotadorAdapter(clase);
        clase.setJUG2(7);
        assertEquals(7,adapter.getJUG2());
    }

}