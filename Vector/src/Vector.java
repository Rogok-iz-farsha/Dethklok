
/**
 *
 * @author Alex_Rozhkov
 */
public class Vector {

    public final double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double lenght(Vector other) {
        return Math.sqrt(x * x + y * y + z * z);     // Длина вектора
    }

    public Vector sum(Vector other) {
        return new Vector(x + other.x, y + other.y, z + other.z);   // Сумма двух векторов
    }

    public Vector subtruct(Vector other) {
        return new Vector(x - other.x, y - other.y, z - other.z);    //Разность двух векторов
    }

    public Vector multiply(double a) {
        return new Vector(x * a, y * a, z * a);                      //Умножение вектора на число
    }

    public double multiplyScalar(Vector other) {               //Скалярное умножение векторов
        return (this.x * other.x + this.y * other.y + this.z * other.z);
    }

    public Vector multiplyVector(Vector other) {
        return new Vector(y * other.z - other.y * z, other.x * z - x * other.z, x * other.y - other.x * x);    // Векторное умножение
    }

    public double cos(Vector other) {
        return (this.multiplyScalar(other) / (lenght(this) * lenght(other)));                  //Косинус угла между векторами
    }

    @Override
    public boolean equals(Object c) {
        if (c instanceof Vector) {
            Vector other = (Vector) c;
            return (this.x == other.x && this.y == other.y && this.z == other.z);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(x < 0 ? "-" + x * (-1) : "" + x) + "*i" + (y < 0 ? " - " + y * (-1) : " + " + y) + "*j"
                + (z < 0 ? " - " + z * (-1) : " + " + z) + "*k";

    }

}
