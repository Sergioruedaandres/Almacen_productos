/**
 * Abstract class ModeloAbs - Clase de acceso a Modelo de DATOS
 * 
 * @author: 
 * Date: 
 */
public abstract class ModeloAbs
{
    public ModeloAbs() {
    }
    
    abstract public boolean insertarProducto ( Producto p);
    
    abstract boolean borrarProducto ( int codigo );
    
    abstract public Producto buscarProducto ( int codigo);
    
    abstract void listarProductos ();
    
    abstract boolean modificarProducto (Producto nuevo);
    
    
}
