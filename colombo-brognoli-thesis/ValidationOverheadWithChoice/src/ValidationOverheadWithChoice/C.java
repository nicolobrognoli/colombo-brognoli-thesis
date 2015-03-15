package ValidationOverheadWithChoice;

public class C implements ActivityInterface {

	@Override
	public void doActivity() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
