package practicaclase03colas;
//Nodo es un objeto que tiene atributos y comportamientos
//Atributo # 1 dato (Puede ser un String, Entero, Double, Short, Byte, Objeto)
//Atributo # 2 atras (Para enlazar los nodos, Primer nodo apunta a Null y el resto al nodo que tenga atras)
//Un nodo se guarda en otro nodo, sobre la misma variable que la esta declarando

public class Nodo {
    private String dato;
    private Nodo atras; 
            
    //Constructor para inicializar

    public Nodo(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
    
    @Override //Override=Metodo Sobreestrito
    public String toString(){ return dato; } //Devuelve el dato nada mas, como un getDato *Se usa en el Main
    
}
