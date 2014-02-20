package complex;
/**
 * @author Alex_Rog
 */
 class Complex {
    private double a,b;
    static int i=0;
     Complex(){    //конструктор без аргументов
     ++i;}
     
     
     public Complex (double a, double b){
         this.a=a;
         this.b=b;
         
     }
     public double getRe(){
         return a;
     }
     public double getIm(){
         return b;
     }
     
     public Complex add (Complex other){    //сложение
         return new Complex (a + other.a, b + other.b);
     }
     
     public Complex subtruct(Complex other){  //вычитание
         return new Complex(a - other.a,b - other.b);
     }
     
     public Complex multiply(Complex other){  //умножение
         return new Complex(a*other.a-b*other.b,a*other.b+b*other.a);
     }
   
     public Complex divide (Complex other){
         return new Complex((a*other.a+b*other.b)/(Math.pow(other.a, 2)+Math.pow(other.b, 2))
    ,(other.a*b-other.b*a)/(Math.pow(other.a, 2)+Math.pow(other.b, 2))); }  //деление
    
    @Override  
public boolean equals(Object c) {
    if(c instanceof Complex){  Complex other=(Complex) c;
                                  return (this.a==other.a && this.b==other.b); }
      else return false;   
     }
     
     
    @Override
     public String toString (){
        return String.valueOf (a)+ (b<0 ? " - " + b*(-1): " + " + b) + "*i";
         
         
     }
}

class Demo {
    public static void main(String[] args) {
        Complex chislo = new Complex();
        System.out.println ("ComplextNumber class demo");
        Complex c1 = new Complex (5, -2), c2 = new Complex (5, -2), c3=new Complex(-4,-4);
       System.out.println ((c1.equals(c2)) ? "c1=c2" : "c1 != c2");
       System.out.println ((c2.equals(c3)) ? "c2=c3" : "c2 != c3");
       System.out.println ((c1.equals(c3)) ? "c1=c3" : "c1 != c3");
        
    }
    
}
