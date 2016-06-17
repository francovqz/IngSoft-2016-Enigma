package headfirst.combined.djview;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeartModelTest {
    @Test
    public void agetInstace() throws Exception {
        HeartModel model = HeartModel.getInstace();
        model.intentos=-1;
        HeartModel modelo = HeartModel.getInstace();
        assertEquals(0,modelo.intentos);
    }
    @Test
    public void getName() throws Exception {
        HeartModel modelo = HeartModel.getInstace();
        assertTrue(modelo.getName().equals("Heart"));
    }
    @Test
    public void getInstace2() throws Exception {
        HeartModel modelo = HeartModel.getInstace();
        HeartModel modelo2 = HeartModel.getInstace();
        assertFalse(modelo.intentos==0);
    }

    @Test
    public void increaseIntentos() throws Exception {
        HeartModel modelo = HeartModel.getInstace();
        int temp= modelo.intentos;
        modelo.increaseIntentos();
        assertEquals(temp+1,modelo.intentos);
    }

    @Test
    public void getHeartRate() throws Exception {
        HeartModel modelo = HeartModel.getInstace();
        modelo.increaseIntentos();
        modelo.increaseIntentos();
        modelo.increaseIntentos();
        assertEquals(modelo.intentos,modelo.getHeartRate());
    }

    @Test
    public void getJUG1() throws Exception {
        HeartModel modelo = HeartModel.getInstace();
        assertEquals(0,modelo.getJUG1());
    }

    @Test
    public void getJUG2() throws Exception {
        HeartModel modelo = HeartModel.getInstace();
        assertEquals(0,modelo.getJUG2());
    }

}