package study.remotecontrol;

public class RemoteControleExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
//		rc = new Audio();
		rc.turnOff();
	}
}
