package lab13;

public abstract class Players {
	private String name;
	private Roshambo value;

	public Roshambo generateRoshambo() {
		return null;
	}

	public Players() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roshambo getValue() {
		return value;
	}

	public void setValue(Roshambo value) {
		this.value = value;
	}

	public Players(String name, Roshambo value) {
		super();
		this.name = name;
		this.value = value;
	}

}
