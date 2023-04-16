package stereotypes;

// LAS INTERFACES SON CONJUNTOS DE DEFINICIONES DE MÉTODOS
// LAS CUALES PUEDEN SER IMPLMENTADAS POR LAS CLASES
// SI UNA CLASE IMPLEMENTA UNA INTERFAZ, DIREMOS
// QUE LA CLASE SE COMPORTA SEGÚN NUESTRA INTERFAZ
// ASÍ NOS PERMITE OLVIDARNOS DE LA CLASE
// Y HABLAR SÓLO DE LA INTERFAZ
// PERMITENDO QUE EL SISTEMA SE CONSTRUYA DE FORMA EVOLUTIVA
// CUÁNDO SE DISEÑEN NUEVAS CLASES E IMPLEMENTACIONES
// EL SISTEMA YA ESTARÁ FUNCIONANDO

public interface IEmpaquetable {

    public String getDescripcion();
    
    public double getAlto();
    
    public double getAncho();
    
    public double getProfundidad();
    
    public double getPeso();
    
}