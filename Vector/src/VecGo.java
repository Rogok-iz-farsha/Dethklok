/**
 *
 * @author Alex_Rozhkov
 */
public class VecGo {
    public static void main(String[] args) {
    System.out.println ("Ready");
    double l=5;
    
    Vector v1=new Vector (1,2,3), v2=new Vector (0,-4,9); 
    System.out.println ("(" + v1 + ") + (" + v2 + ") = " + v1.sum (v2));
    System.out.println ("(" + v1 + ") - (" + v2 + ") = " + v1.subtruct (v2));
    System.out.println ("(" + v1 + ") * ("+l+") = " + v1.multiply_const(l));
    System.out.println ("[v1,v2] = " + v1.multiply_vec(v2));
    System.out.println ((v1.equals(v2)) ? "c1=c2" : "c1 != c2");
    //System.out.println ("(v1,v2) = " + scalar(v1,v2));    Ошибки
    //System.out.println ("Cos(v1,v2) = " + cos(v1,v2));   
    
    }
    
}
