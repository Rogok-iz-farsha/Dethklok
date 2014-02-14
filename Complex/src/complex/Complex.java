package complex;

/**
 *
 * @author Alex
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
                 ,(other.a*b-other.b*a)/(Math.pow(other.a, 2)+Math.pow(other.b, 2)));   //деление
     }
    @Override
     public String toString (){
         return String.valueOf (a) + " + " + b + "*i";
     }
}

class Demo {
    public static void main(String[] args) {
        Complex chislo = new Complex();
        System.out.println ("ComplextNumber class demo");
        Complex c1 = new Complex (5, 3), c2 = new Complex (2, -1);
     System.out.println ("(" + c1 + ") + (" + c2 + ") = " + c1.add (c2));
     System.out.println ("(" + c1 + ") - (" + c2 + ") = " + c1.subtruct (c2));
     System.out.println ("(" + c1 + ") * (" + c2 + ") = " + c1.multiply (c2));
     System.out.println ("(" + c1 + ") / (" + c2 + ") = " + c1.divide (c2));
        
    }
    
}
