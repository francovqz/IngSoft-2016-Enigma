package headfirst.combined.djview;

public interface HeartModelInterface {
	String getName();
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
	void registerObserver(JUG1Observer o);
	void removeObserver(JUG1Observer o);
	void registerObserver(JUG2Observer o);
	void removeObserver(JUG2Observer o);
	void on();
}
