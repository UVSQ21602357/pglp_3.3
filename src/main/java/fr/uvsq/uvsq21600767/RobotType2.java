package fr.uvsq.uvsq21600767;

public class RobotType2 extends Robot{
	public RobotType2(int position) {
		super(position);
	}
	public void avance() {
		super.position += 10;
	}
}
