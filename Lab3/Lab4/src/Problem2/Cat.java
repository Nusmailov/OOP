package Problem2;

public class Cat extends Animal{
	private String sound;
	
	@Override
	public void setSound(String sound) {	
		this.sound = sound;
	}

	@Override
	public String getSound() {
		return sound;
	}
	
}
