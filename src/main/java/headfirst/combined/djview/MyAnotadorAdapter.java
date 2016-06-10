package headfirst.combined.djview;

public class MyAnotadorAdapter implements BeatModelInterface{
    MyAnotadorInterface anotador;
    public MyAnotadorAdapter(MyAnotadorInterface anotador) {
        this.anotador = anotador;
    }

    public String getName(){return "Anotador";}
    public void initialize() {}

    public void on() {}

    public void off() {}

    public int getBPM() {
        return anotador.getBPM();
    }

    public void setBPM(int bpm) {anotador.setBPM(bpm);}

    public void registerObserver(BeatObserver o) {
        anotador.registerObserver(o);
    }

    public void removeObserver(BeatObserver o) {
        anotador.removeObserver(o);
    }

    public void registerObserver(BPMObserver o) {
        anotador.registerObserver(o);
    }

    public void removeObserver(BPMObserver o) {
        anotador.removeObserver(o);
    }

    public void registerObserver(JUG1Observer o) {
        anotador.registerObserver(o);
    }

    public void removeObserver(JUG1Observer o) {
        anotador.removeObserver(o);
    }
    public void registerObserver(JUG2Observer o) {
        anotador.registerObserver(o);
    }

    public void removeObserver(JUG2Observer o) {
        anotador.removeObserver(o);
    }

     public int getJUG1() {
        return anotador.getJUG1();
    }
    public int getJUG2() {
        return anotador.getJUG2();
    }
}
