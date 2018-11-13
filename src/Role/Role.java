package Role;

public abstract class Role implements Fighting{
	protected int blood;
	protected int level;
	protected String name;
	public abstract void fight(); //Implement "Fighting" abstract method 
	//Constructor 建構式
	public Role() {}
	
	public Role(String name) {
		this.name = name;
	}
	public Role(String name,int blood) {
		this(name);
		this.blood = blood;
	}
	public Role(String name,int blood, int level){
		this(name,blood);
		this.level = level;
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
	public void setName(String name) {
		this.name = name;
	}
	//運用 toString 顯示角色資訊
	public String toString(){  
		return String.format("%s, %d, %d",this.name,this.level,this.blood);
	}
}
