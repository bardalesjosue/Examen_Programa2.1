
public class Rectangulo extends FiguraGeometrica {
	private double Base;
	private double Altura;
	
	protected Rectangulo(String Color,double Base,double Altura)
	{
		super(Color);
		this.Altura=Altura;
		this.Base=Base;
	}
	protected double getBase()
	{
		return Base;
	}
	protected double getAltura()
	{
		return Altura;
	}
	protected void setAltura(double Altura)
	{
		this.Altura=Altura;
	}
	protected void setBase(double Base)
	{
		this.Base=Base;
	}
	protected double getArea()
	{
		return Base*Altura;
	}
		
}
