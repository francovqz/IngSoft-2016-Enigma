package headfirst.combined.djview;


public class MyAnotadorController implements ControllerInterface{
    MyAnotadorInterface model;
    DJView view;

    public MyAnotadorController(MyAnotadorInterface model){
        this.model = model;
        view = new DJView(this, new MyAnotadorAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        //model.initialize();
    }

    public MyAnotadorController(MyAnotadorInterface model,DJView view){
        this.model = model;
        this.view = view;
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        //model.initialize();
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
    public void increaseBPM(){increasePlayer2();}
    public void decreaseBPM(){increasePlayer1();}
    public void setBPM(int bpm){model.setBPM(bpm);}
    public void increasePlayer1(){
        int ju1 = model.getJUG1();
        model.setJUG1(ju1 + 1);
    }
    public void increasePlayer2(){
        int ju2 = model.getJUG2();
        model.setJUG2(ju2 + 1);
    }
}
