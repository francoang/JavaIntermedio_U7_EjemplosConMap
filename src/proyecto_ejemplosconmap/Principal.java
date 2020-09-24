package proyecto_ejemplosconmap;

/**
 * Unidad 07. Ejemplos
 * Ejemplos utilizando la interfaz Map
 * @author Angonoa Franco
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfazMap im = new InterfazMap();
        
        System.out.println("===CON HASHTABLE===");
        im.conHashtable();
        
        System.out.println("\n===CON HASHMAP===");
        im.conHashMap();
        
        System.out.println("\n===CON TREEMAP===");
        im.conTreeMap();
    }
    
}
