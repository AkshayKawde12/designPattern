package AdapterDesign;
import AdapterDesign.pilotPen;

public class penAdapter implements pen
{
	pilotPen pp = new pilotPen(); 
	@Override
	public void write(String str) {
		pp.mark(str);
		
	}

}
