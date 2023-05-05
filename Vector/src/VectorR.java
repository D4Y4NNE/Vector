import static java.lang.Math.cos;

public class VectorR
{
    private double a;
    private double b;
    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
    }
    /*public double obtenerCoseno()
    {
        double coseno;
        coseno = this.getA() - this.getB();
        return coseno;
    }*/


    public double obtenerResultante()
    {
        double resultante;
        resultante = Math.sqrt(Math.pow(this.getA(),2)+Math.pow(this.getB(),2)+ 2*(this.getA()*this.getB()*cos(70)));
        //resultante = Math.sqrt(Math.pow(this.getA(),2) + Math.pow(this.getB(),2) + 2*this.getA()*this.getB()* cos(obtenerCoseno()));

        return resultante;
    }
}