package headfirst.combined.djview;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyAnotadorTest {
    @Test
    public void getName() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        assertTrue(clase.getName()=="Anotador");
    }
    @Test
    public void ceroAlEmpezar() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        int a= clase.getJUG1();
        int b= clase.getJUG2();
        int c= clase.getBPM();
        assertTrue(a==0);
        assertTrue(b==0);
        assertTrue(c==0);
    }
    @Test
    public void setBPM() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        clase.setBPM(20);
        assertTrue(clase.getBPM()==20);
        clase.setBPM(-10);
        assertTrue(clase.getBPM()==-10);
    }

    @Test
    public void setJUG1() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        clase.setJUG1(3);
        assertTrue(clase.getJUG1()==3);
        clase.setJUG1(-1);
        assertTrue(clase.getJUG1()==-1);
    }

    @Test
    public void setJUG2() throws Exception {
        MyAnotadorModel clase= new MyAnotadorModel();
        clase.setJUG2(4);
        assertTrue(clase.getJUG2()==4);
        clase.setJUG2(0);
        assertTrue(clase.getJUG2()==0);
    }
}