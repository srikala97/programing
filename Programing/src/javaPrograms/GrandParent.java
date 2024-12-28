package javaPrograms;

public class GrandParent {

	public static void main(String[] args) {
		
		Parent p=new Child();
		p.name="Srikala";
	
        Child c=(Child)p;
        c.age=18;
        System.out.println(c.name);
        System.out.println(c.age);
        c.ShowMessage();
	}
        
}
