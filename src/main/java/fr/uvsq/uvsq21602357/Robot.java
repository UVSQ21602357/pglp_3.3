package fr.uvsq.uvsq21602357;

public class Robot {
	public int position;
	public Robot(int pos) {
		this.position = pos;
	}
	public void avance() {
		this.position += 10;
	}
}
