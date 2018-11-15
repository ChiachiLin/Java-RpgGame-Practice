package Role;

public abstract class Role implements Fighting{
	protected int blood;
	protected int level;
	protected String name;
	protected int atk;
	public abstract void fight(); //Implement "Fighting" abstract method 
	//Constructor 建構式
	public Role() {}
	
	public Role(String name) {
		this();
		setName(name);
	}
	public Role(String name,int blood) {
		this(name);
		setBlood(blood);
	}
	public Role(String name,int blood, int level){
		this(name,blood);
		setLevel(level);
	}
	public Role(String name,int blood, int level,int atk){
		this(name,blood,level);
		setAtk(atk);
	}
	public int getBlood() {
		return this.blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getLevel() {
		return this.level;
	}
	public void setLevel(int level) {
		this.level += level;
	}
	public String getName() {
		return this.name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public int getAtk() {
		return this.atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	//運用 toString 顯示角色資訊
	public String toString(){  
		return String.format("%s, %d, %d,%d",this.name,this.level,this.blood,this.atk);
	}
	
}
