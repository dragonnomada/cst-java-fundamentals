package models;

// SOBRECARGA DE MÉTODOS:
// Cualquier método puede ser sobrecargado
// para soportar DISTINTOS parámetros
// un método NO PUEDE ser sobrecargado con los mismos parámetros
// A un conjunto de parámetros se le conoce como la firma
// y se determina por el tipo de dato de cada parámetro
// () -> Sin parámetros
// (int, int) -> Dos parámetros int
// (int, String) -> Un int y un String

public class Point3D {

    private double x;
    private double y;
    private double z;
    
    // Point3D()
    public Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }
    
    // Point3D(double, double, double)
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    // Point3D(double, double, double, double)
    public Point3D(double x, double y, double z, double scalar) {
        this.x = x * scalar;
        this.y = y * scalar;
        this.z = z * scalar;
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
    
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    
    // middlePoint() - To origin
    public Point3D middlePoint() {
        return new Point3D(x / 2, y / 2, z / 2);
    }
    
    // middlePoint(Point3D) - To other point
    public Point3D middlePoint(Point3D otherPoint) {
        double mx = (x + otherPoint.getX()) / 2;
        double my = (y + otherPoint.getY()) / 2;
        double mz = (z + otherPoint.getZ()) / 2;
        return new Point3D(mx, my, mz);
    }
    
    public double distanceTo(Point3D otherPoint) {
        double dx = x - otherPoint.getX();
        double dy = y - otherPoint.getY();
        double dz = z - otherPoint.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    
    public boolean inSphere(Point3D center, double radius) {
        double d = distanceTo(center);
        return d <= radius;
    }
    
}
