package Role;

public class Magician extends Role implements Cureing{
	public Magician(String name, int blood, int level) {
		super(name, blood);
		this.level = level;
	}

	@Override
	public void fight() {
		System.out.print("�]�k����!");
	}
	@Override
		public String toString() {
			return "�k�v"+super.toString();
		}
	@Override
	public void cure() {
		System.out.print("�v¡");
	}

	}


