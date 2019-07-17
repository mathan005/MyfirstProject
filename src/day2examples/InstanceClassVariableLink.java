package day2examples;

public class InstanceClassVariableLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instance/Global variable is not editable to the different methods/objects.
		MethodVariarables clasVar=new MethodVariarables();
		clasVar.a6++;
		MethodVariarables clasVar1=new MethodVariarables();
		clasVar1.a6++;
		MethodVariarables clasVar2=new MethodVariarables();
		System.out.println(clasVar2.a6);
		
		//The static variable is used as a Class variable which is given below and it is editable.
		MethodVariarables clasVar3=new MethodVariarables();
		clasVar3.a7++;
		MethodVariarables clasVar4=new MethodVariarables();
		clasVar4.a7++;
		MethodVariarables clasVar5=new MethodVariarables();
		System.out.println(clasVar5.a7);
		
	}

}

