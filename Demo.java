class Demo
{
	public static void main(String[] args)
	{
		Shape s;
		s=new Circle();
		s.findArea();
		s.printArea();
		s=new Rectangle();
		s.findArea();
		s.printArea();
		s=new Triangle();
		s.findArea();
		s.printArea();
		
	}
}