package Role;

public class SwordsMan  extends Role{

	public SwordsMan(String name,int blood,int level) {
		super(name,blood);
		this.level = level;
	}
		@Override
		public void fight() {
			System.out.print("���C����!");
		}
		@Override
		public String toString() {
			return "�C�h"+super.toString();
		}
	}


