package headfirst.combined.djview;


public class MyAnotadorController implements ControllerInterface{
    BeatModelInterface model;
    DJView view;

    public MyAnotadorController(){
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    public void start(){
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }
    public void stop(){
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }
    public void increaseBPM(){}
    public void decreaseBPM(){}
    public void setBPM(int bpm){}
}
