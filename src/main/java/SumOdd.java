public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
    // Función número impar.
    private static boolean isOdd(int number) {
        return number % 2 == 1;
    }
    // Función que suma los impares dentro de un rango determinado.
    private static int sumOdd(int start, int end) {
        int sum = 0; // Inicialización de variable.
        // Validación de parámetros.
        if(!(start >= 1 && start <= end)) {
            return -1;
        }
        // Asegura que se comience desde un número impar.
        if(!isOdd(start)) {
            start++;
        }
        // Bucle for que suma todos los números impares dentro del rango establecido.
        for(int i = start; i <= end; i += 2) {
            sum+=i;
        }
        return sum;
    }
}