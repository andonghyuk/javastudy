package s0623;

public class ExecuteObj {
	public static void main(String[] args) {
		ObjTest[] obj = new ObjTest[20];
		
		for(int i = 0; i <obj.length; i++) {
			obj[i] = new ObjTest();
			obj[i].setName("fdsafdda" + i);
			obj[i].setAge(i);
			
			System.out.println(obj[i]);
		}
	}
}
