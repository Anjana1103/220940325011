class GrandParent{
	String grandFatherName;
	String grandMotherName;
	
	GrandParent(String grandFatherName,String grandMotherName){
		this.grandFatherName=grandFatherName;
		this.grandMotherName=grandMotherName;
		
		System.out.println("Grandfather's name is "+grandFatherName+" and Grandmother's name is "+grandMotherName);
	}
}

class Parent extends GrandParent{
	String fatherName;
	String motherName;
	
	Parent(String grandFatherName, String grandMotherName,String fatherName,String motherName){
		super(grandFatherName,grandMotherName);
		this.fatherName=fatherName;
		this.motherName=motherName;
		System.out.println("Father's name is "+fatherName+" and Mother's name is "+motherName);
	}
	
	Parent(String grandFatherName,String grandMotherName){
		super(grandFatherName,grandMotherName);
	}
}

class Child extends Parent{
	Child(String grandFatherName,String grandMotherName,String fatherName,String motherName){
		super(grandFatherName,grandMotherName,fatherName,motherName);
	}
	public static void main(String args[]){
		Child c=new Child("James","Lily","Harry","Ginny");
	
	}
}