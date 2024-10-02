package h_info;

// VO := DTO
public class InfoVO {


	private String name;
	private String id;
	private String tel;
	private int	   age;
	private String sex;
	private String home;
	
	
	// default constructor, 기본생성자
	public InfoVO() {				
	}

	public InfoVO(String name, String id, String tel, int age, String sex, String home) {
		this.name = name;
		this.id = id;
		this.tel = tel;
		this.age = age;
		this.sex = sex;
		this.home = home;
	}

	// setter, getter 'private'로 했기 때문에 외부에서는 호출이 안된다. 때문에 셋터 겟터를 이용해서 보완해줌
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}
	
	@Override
	public String toString() {
		return "InfoVO [name=" + name + ", id=" + id + ", tel=" + tel + ", age=" + age + ", sex=" + sex + ", home="
				+ home + "]  \n";
	}
	
}
