package ValidationOverheadWithChoice;

public class B implements ActivityInterface {

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
