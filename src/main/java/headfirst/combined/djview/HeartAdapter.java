package headfirst.combined.djview;

public class HeartAdapter implements BeatModelInterface {
	HeartModelInterface heart;
 
	public HeartAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}

    public void initialize() {}
  
    public void on() {}
  
    public void off() {}
   
	public int getBPM() {
		return heart.getHeartRate();
	}
  
    public void setBPM(int bpm) {}
   
	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}
    
	public void removeObserver(BeatObserver o) {
		heart.removeObserver(o);
	}
     
	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}
  
	public void removeObserver(BPMObserver o) {
		heart.removeObserver(o);
	}

	public void registerObserver(JUG1Observer o) {
		heart.registerObserver(o);
	}

	public void removeObserver(JUG1Observer o) {
		heart.removeObserver(o);
	}
	public void registerObserver(JUG2Observer o) {
		heart.registerObserver(o);
	}

	public void removeObserver(JUG2Observer o) {	heart.removeObserver(o);}
	public int getJUG1(){return 0;}
	public int getJUG2(){return 0;}
}
