public class InvertirCadena {
    public static void main(String[] args) {
        String texto = "Hola Munfdfgdo";
        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida = invertida + texto.charAt(i);
        }

        System.out.println(invertida);
    }
}
