//Colas
//Elementos que hacen "Fila"
//Caracteristicas
//Solo puedo COLOCAR elementos en la parte anterior al ultimo elemento (Encola)
//Solo puedo TOMAR elementos que estan al frente de la cola (Atiende)
//Existen colas modificadas, por ejemplo cuando un adulto mayor o discapacitado llega a la fila, se le debe dar prioridad
//Cola Modificada es un 95% parecido a Pila Modificada (Pop Modificado)
//Estructura de acceso restrictivo
//FIFO First In First Out

package practicaclase03colas;


public class Main {


    public static void main(String[] args) {
        
        //Inicializamos la cola
        Cola cola1 = new Cola(); //Clase + Objeto = new Cola();
        
        //Agregar Nodos a la cola
        cola1.encola(new Nodo("Danny"));
        cola1.encola(new Nodo("Jorge"));
        cola1.encola(new Nodo("David"));
        cola1.encola(new Nodo("Katherine"));
        cola1.encola(new Nodo("Allan"));
        
        //Imprimo la cola
        System.out.println("===== La cola original es: =====");
        System.out.println(cola1);
        
        System.out.println("===== Atiendo 1 Vez: =====");
        System.out.println(cola1.atiende());
        System.out.println("===== La cola modificada es: =====");
        System.out.println(cola1);
        
        //Agrego otro Nodo a la cola
        cola1.encola(new Nodo("Mario"));
        
        System.out.println("===== Encola 1 mas =====");
        System.out.println(cola1);
    }
    
}   
