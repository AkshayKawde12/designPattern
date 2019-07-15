package AdapterDesign;

public class Assignmnet 
{
	private pen p;
	public pen getP() {
		return p;
	}
	public void setP(pen p) {
		this.p = p;
	}
	public void writeAssignmanet(String str)
	{
		p.write(str);
	}
}
