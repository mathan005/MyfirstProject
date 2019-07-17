package day1examples;

public class Staticfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Staticfile b= new Staticfile();
	b.go();
    go1();		
   
    

	}
	
	public void go()
	{
		System.out.println("printing 1st method");
		go1();
		go2();
		
		
	}
	public static void go1 (){
		System.out.println("printing 2nd method");
		
}
	public void go2 (){
		System.out.println("printing 3rd method");
		
		
	
}
}




