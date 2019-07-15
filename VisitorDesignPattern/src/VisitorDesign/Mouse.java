package VisitorDesign;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor ComputerPartVisitor) 
	{
			computerPartVisitor.visit(this);
		
	}

}
