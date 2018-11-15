package Role;

public class SwordsMan  extends Role{

	public SwordsMan(String name,int blood,int level, int atk) {
		super(name,blood,level);
		this.atk = atk;
	}
		@Override
		public void fight() {
			System.out.print("´§¼C§ðÀ»!");
		}
		@Override
		public String toString() {
			return "¼C¤h"+super.toString();
		}
		public  int setAtk() {
			return super.atk=super.atk+5;
		}
	}


