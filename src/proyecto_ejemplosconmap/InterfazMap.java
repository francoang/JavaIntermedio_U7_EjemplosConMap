package proyecto_ejemplosconmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author fnang
 */
public class InterfazMap {

    public void conHashtable() {
        Map<Integer, String> misProductos = new Hashtable<>();
        misProductos.put(7589, "Televisor");
        misProductos.put(5123, "Computadora");
        misProductos.put(6025, "Heladera");
//        misProductos.put(null, "Libro"); //Hashtable no me deja
//        misProductos.put(1254, null); //Hashtable no me deja

        //Esta comentado porque ocurre un error de ejecucion, devolviendo un NullPointerException.

        Set<Integer> keys = misProductos.keySet();

        System.out.println("=== Mis Productos ===");
        for (Integer key : keys) {
            System.out.println("Producto#: " + key + " "
                    + misProductos.get(key));
        }
        
        System.out.println(misProductos.toString());
        
    }
    
    public void conHashMap() {
        Map<Integer, String> misProductos = new HashMap<>();
        misProductos.put(7589, "Televisor");
        misProductos.put(5123, "Computadora");
        misProductos.put(6025, "Heladera");
        misProductos.put(null, "Libro"); 
        misProductos.put(1254, null);

        Set<Integer> keys = misProductos.keySet();

        System.out.println("=== Mis Productos ===");
        for (Integer key : keys) {
            System.out.println("Producto#: " + key + " "
                    + misProductos.get(key));
        }
    }
    
    public void conTreeMap(){
        Map<String, String> misCamisas = new TreeMap<>();
        misCamisas.put("SS10", "Camisa azul");
        misCamisas.put("SS01", "Camisa negra");
        misCamisas.put("AA10", "Camisa gris");        

        misCamisas.put("SS01", "Nueva camisa negra"); // sobreescribe el valor
        Set<String> keys = misCamisas.keySet(); //keySet() :Set<K>

        
        System.out.println("=== Mis camisas ===");
        for (String key : keys) {
            System.out.println("Camisa#: " + key + " "
                    + misCamisas.get(key));
        }
        
        Collection<String> valores = misCamisas.values();
        System.out.println("==SOLO SON VALORES==");
        for(String val : valores){
            System.out.println(val);
        }
    }
}
