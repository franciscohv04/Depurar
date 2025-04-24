public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[]{
                new Estudiante("Ana", 20, new double[]{8.5, 9.0, 7.5}),
                new Estudiante("Luis", 22, new double[]{6.0, 5.5}),
                new Estudiante("Marta", 19, new double[]{9.5, 10.0}),
                new Estudiante("Carlos", 21, new double[]{}) // Error: sin notas
        };
        for (int i = 0; i < estudiantes.length; i++) { //Creo un bucle para recorrer el array de estudiantes y asi poder calcular la nota media de cada uno
            double nota = GestorEstudiantes.calcularNotaMedia(estudiantes[i]); //Calculo la nota media del estudiante
            System.out.println("Nota media del estudiante: " + estudiantes[i].getNombre() + " Nota media: " + nota);//Muestro el nombre y nota media del estudiante
        }

        System.out.println("Calculando el mejor estudiante...");
        Estudiante mejor = GestorEstudiantes.encontrarMejorEstudiante(estudiantes);
        System.out.println("El mejor estudiante es: " + mejor.getNombre()); // Posible NullPointerException

        Estudiante[] estudiantes2 = new Estudiante[0];
        Estudiante estudiante = GestorEstudiantes.encontrarMejorEstudiante(estudiantes2);
        if (estudiante == null) { //He creado una condición para comprobar si la lista está vacia muestre por pantalla que la lista está vacia
                                  //y si no lo está devuelva al mejor estudiante.
            System.out.println("No hay mejor estudiante ya que la lista está vacia");
        } else {
            System.out.println("Mejor estudiante: " + estudiante);
        }

        System.out.println("Guardando resultados...");
        GestorEstudiantes.guardarResultados(estudiantes, "resultados.txt");
    }
}
