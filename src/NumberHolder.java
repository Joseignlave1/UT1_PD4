public class NumberHolder {
    public int anInt;
    public float aFloat; 

    public NumberHolder() {
        this.anInt = 7;
        this.aFloat = 6;
    }
    public static void main(String[] args) {
        /*
            1)
             String[] students = new String[10];
             String studentName = "Peter Parker";
             students[0] = studentName;
             studentName = null;
         */
        /*
             NumberHolder numberHolder = new NumberHolder();
             System.out.println("int value " + numberHolder.anInt);
             System.out.println("float value " + numberHolder.aFloat);
         */

    }
    /*
    1)
        ¿Cuántas referencias a estos objetos existen luego de que el código se ha ejecutado?

        Existen 2 referencias en total, una referencia al objeto students(que es un array) y otra
        referencia al String "Peter Parker" inicialmente asignada a la variable studentName.
        Hay que decir qué aunque en la última sentencia se asigne el valor null a la variable studentName
        la referencia al valor de esa variable no se va a eliminar, ya qué anteriormente se le asignó a la posición 0
        del array de students.

        ¿Es alguno de los objetos candidato a eliminado por el garbage collector?

        No, ninguno de estos objetos es candidato a ser eliminado por el garbage collector,
        en primer lugar el Array students está siendo referenciado por la variable students,
        y el String "Peter Parker" aunque deja de ser referenciado por la variable debido a qué a la variable se le asigna el valor
        de null, es agregado a la posición 0 del array de students.
        Por lo que ningúno de los objetos es candidato directo a ser eliminado por el garbage collector.

        2)Cómo hace un programa para destruir un objeto que ha creado?

        En Java los objetos creados en un programa son eliminados automáticamente cuándo no son referenciados por ninguna
        variable en el programa.

     */
}
