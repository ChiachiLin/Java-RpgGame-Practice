package Role;

public class SwordsMan  extends Role{

	public SwordsMan(String name,int blood,int level) {
		super(name,blood);
		this.level = level;
	}
		@Override
		public void fight() {
			System.out.print("´§¼C§ðÀ»!");
		}
		@Override
		public String toString() {
			return "¼C¤h"+super.toString();
		}
	}


