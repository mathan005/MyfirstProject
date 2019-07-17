package abstractpackage;

public class Child1 implements Parent1,Parent2 {

	public void show(){
		System.out.println("op from Class1");
	}

	
	public static void main(String[] args) {
		Parent2 value=new Child1();
		value.show();
	}


	@Override
	public void verify() {
		// TODO Auto-generated method stub
		
	}
}

