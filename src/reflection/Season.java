package reflection;

public enum Season {
	SPRING("春天","chuntian"),
	SUMMER("夏天","xiatian"),
	FALL("秋天","qiutian"),
	WINTER("冬天","dongtian");
	
	private String name;
	private String desc;
	
	
	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
