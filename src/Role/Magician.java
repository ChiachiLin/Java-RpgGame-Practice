package Role;

public class Magician extends Role implements Cureing{
	public Magician(String name, int blood, int level,int atk) {
		super(name, blood,level);
		this.atk = atk;
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
	public  int setAtk() {
		return super.atk=super.atk+15;
	}
	}


