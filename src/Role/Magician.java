package Role;

public class Magician extends Role implements Cureing{
	public Magician(String name, int blood, int level,int atk) {
		super(name, blood,level);
		this.atk = atk;
	}

	@Override
	public void fight() {
		System.out.print("魔法攻擊!");
	}
	@Override
		public String toString() {
			return "法師"+super.toString();
		}
	@Override
	public void cure() {
		System.out.print("治癒");
	}
	public  int setAtk() {
		return super.atk=super.atk+15;
	}
	}


