public class Rectangle {
    public double width;
    public double height;
    public double area() {
        return width * height;
    }
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}

/*
    Cosas que están mal en el programa:
    Primero crea una instancia de una clase la cuál no existe  Rectangle myRect;
    Después intenta asignarle un valor a una variable(ya qué no existe la clase no podemos determinar si esa variable
    es de instancia o de clase) que tampoco existe. myRect.width = 40;
    Intenta realizar lo mismo en la siguiente ejecución.  myRect.height = 50;
    Por último, intenta imprimir por pantalla, un método de la clase Rectangle(la cuál no existe)
    Por lo tanto el método no existe.

    Además de todo eso, suponiendo que la clase Rectangle existiera, no inicializa bien el objeto
    la forma correcta sería Rectangle myRect = new Rectangle();
 */
