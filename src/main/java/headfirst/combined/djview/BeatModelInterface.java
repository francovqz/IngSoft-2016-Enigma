package headfirst.combined.djview;
  
public interface BeatModelInterface {
	void initialize();
  
	void on();
  
	void off();
  
    void setBPM(int bpm);
  
	int getBPM();
	int getJUG1();
	int getJUG2();
	void setJUG1(int i);
	void setJUG2(int i);
	String getName();
  
	void registerObserver(BeatObserver o);
  
	void removeObserver(BeatObserver o);
  
	void registerObserver(BPMObserver o);
  
	void removeObserver(BPMObserver o);

	void registerObserver(JUG1Observer o);
	void removeObserver(JUG1Observer o);
	void registerObserver(JUG2Observer o);
	void removeObserver(JUG2Observer o);

}
