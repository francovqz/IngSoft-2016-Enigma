package headfirst.combined.djview;

import java.util.*;

public class MyAnotadorModel implements MyAnotadorInterface {

    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers = new ArrayList();
    ArrayList jug1Observers = new ArrayList();
    ArrayList jug2Observers = new ArrayList();
    int bpm = 0;
    int jug1 = 0;
    int jug2 = 0;


    public void on() {
       setBMP(getBPM());
        setJUG1(getJUG1());
        setJUG2(getJUG2());
    }

    public void off() {
        setBMP(0);
    }

    public void setBMP(int bpm){
        this.bpm = bpm;
        notifyBPMObservers();
    }

    public int getBPM(){
        return bpm;
    }

    public void setJUG1(int jug1){
        this.jug1 = jug1;
        notifyJUG1Observers();
    }

    public int getJUG1(){
        return jug1;
    }

    public void setJUG2(int jug2){
        this.jug2 = jug2;
        notifyJUG2Observers();
    }

    public int getJUG2(){
        return jug2;
    }

    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        if (i >= 0) {
            bpmObservers.remove(i);
        }
    }

     public void removeObserver(JUG1Observer o) {
         int i = jug1Observers.indexOf(o);
         if (i >= 0) {
             jug1Observers.remove(i);
         }
    }

    public void removeObserver(JUG2Observer o) {
        int i = jug2Observers.indexOf(o);
        if (i >= 0) {
            jug2Observers.remove(i);
        }
    }

    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }
     public void registerObserver(JUG1Observer o) {
        jug1Observers.add(o);
    }

    public void registerObserver(JUG2Observer o) {
        jug2Observers.add(o);
    }

    public void notifyBPMObservers() {
        for(int i = 0; i < bpmObservers.size(); i++) {
            BPMObserver observer = (BPMObserver)bpmObservers.get(i);
            observer.updateBPM();
        }
    }

    public void notifyJUG1Observers() {
        for(int i = 0; i < jug1Observers.size(); i++) {
            JUG1Observer observer = (JUG1Observer)jug1Observers.get(i);
            observer.updateJUG1();
        }
    }

    public void notifyJUG2Observers() {
        for(int i = 0; i < jug2Observers.size(); i++) {
            JUG2Observer observer = (JUG2Observer)jug2Observers.get(i);
            observer.updateJUG2();
        }
    }
}
