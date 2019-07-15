package AdapterDesign;

public class AdapterDesign {
	public static void main(String args[])
	{
		Assignmnet a=new Assignmnet();
		pen p=new penAdapter();
		a.setP(p);
		a.writeAssignmanet("i am board to write assignment");
	}

}
