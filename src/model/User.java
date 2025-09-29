package model;

public class User {
	// ctrl + shift +f sirve para arreglar el formato o corregir
	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
// get sirve para recoger informacion de un objeto
// set sirve para darle valor al atributo 	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	int age;
	String sex;
	float height;
	String pasword;
	private long id;
	boolean  vip;
	public User(long id, String name) {
		// es un constructor tambien pero con parametros
		this.name =name;
		// this.name se refiere al string (objeto )de name y  =name es igual 
		// user2 que lee el parametro name y saca hugo que es el nombre 
		// que se ha puesto en user 
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
	// el constructor sirve para crear objetos en cualquier documento
	
	public User(long id,String name,boolean  vip,String pasword,float height,String sex,int age) {
		this.id =id;
		this.name =name;
		this.vip =vip;
		this.pasword =pasword;
		this.height =height;
		this.sex =sex;
		this.age =age;
	}
}
