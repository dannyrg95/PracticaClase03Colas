//La Cola va a necesitar de los atributos (Frente) y (Ultimo)
//Tambien necesito saber cual es la cantidad de nodos que tiene mi pila (Atributo largo)
//La Cola existe cuando frente no sea nulo
package practicaclase03colas;

/**
 *
 * @author danny
 */
public class Cola {

    private Nodo frente; //El Nodo que este de primero se llama Frente
    private Nodo ultimo; //El Nodo que este de ultimo se llama ultimo
    private int largo;

    //Se crea un constructor, pero a nivel de Java, por lo tanto no lo vemos, pero se veria como un constructor vacio
    //Frente y Ultimo inicializan en Null
    public Cola() {
        this.frente = null;
        this.ultimo = null;
    }

    //Metodo Encola
    public void encola(Nodo nuevoNodo) {
        //Si el frente es nulo? Entonces
        if (frente == null) { //Significa que la cola esta vacia
            frente = nuevoNodo; //Frente es el nuevo nodo
            ultimo = nuevoNodo; //Ultimo es el nuevo nodo
        } else { //De lo contrario, si ya tengo un nodo dentro
            ultimo.setAtras(nuevoNodo); //Ultimo setAtras al nuevo nodo
            ultimo = nuevoNodo; //Ultimo ahora es el nuevo nodo
        }
        //Contador del largo del nodo, por cada nodo que agrego le sumo 1
        largo++;
    }

    //Metodo Atender o extraer
    public Nodo atiende() {
        Nodo aux = frente; //Necesito un nodo auxiliar que me guarde la referencia del frente
        if (frente != null) { //Si frente es Diferente de Nulo, Entonces?
            frente = frente.getAtras(); //Frente es igual a getAtras
            aux.setAtras(null); //Aux setAtras lo paso a Nulo para ser eliminado de la cola
            //Contador del largo del nodo, por cada nodo que atiendo le resto 1
            largo--;
        }
        return aux;
    }
    
    //Metodo toString, para imprimir la cola
    @Override //Override=Metodo Sobreestrito
    public String toString(){
        String s = ""; //Inicia Vacio
        Nodo aux = frente; //Necesito un nodo auxiliar para no dañar la Cola
        while(aux != null){ //Mientras Aux sea Diferente a Nulo
            s+=aux+"\n"; // \n Salto de Linea
            aux=aux.getAtras();
        }
        return s;
    }
}
