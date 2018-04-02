import java.io.Serializable;

public class Mark implements Serializable {
	int points=0;

	@Override
	public String toString() {
		return "Mark [points=" + points + "]";
	}
}
