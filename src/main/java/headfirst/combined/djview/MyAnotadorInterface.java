package headfirst.combined.djview;

public interface MyAnotadorInterface {

    void on();
    void off();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
    void registerObserver(JUG1Observer o);
    void removeObserver(JUG1Observer o);
    void registerObserver(JUG2Observer o);
    void removeObserver(JUG2Observer o);
    int getBPM();
    void setBPM(int bpm);
    void setJUG1(int jug1);
    int getJUG1();
    void setJUG2(int jug2);
    int getJUG2();
    String getName();
}
