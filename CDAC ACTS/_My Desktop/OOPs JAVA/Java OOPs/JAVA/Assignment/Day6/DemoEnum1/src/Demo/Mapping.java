package Demo;

public enum Mapping {

    SE("Software Engineer"),
    HR("Human Resources"),
    PE("Principal Engineer");

	private String str;
	private Mapping(String string) {
		this.str = string;
	}
	public String getValue()
	{
		return str;
	}
}
