import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ConvertirPNGaHexadecimal {
    public static void main(String[] args) {
        try {
            // Lee la imagen PNG
            //BufferedImage imagen = ImageIO.read(new File("ruta/a/tu/imagen.png"));
            BufferedImage imagen = ImageIO.read(new File("src/imagenes/LOGOATM.png"));

            // Convierte la imagen en una cadena hexadecimal
            String imagenHexadecimal = convertirImagenAHexadecimal(imagen);

            // Imprime la representación hexadecimal
            System.out.println("Imagen en formato hexadecimal:\n" + imagenHexadecimal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String convertirImagenAHexadecimal(BufferedImage imagen) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {
            // Escribe la imagen en formato PNG en el flujo de salida
            ImageIO.write(imagen, "PNG", baos);

            // Convierte los bytes en una cadena hexadecimal
            byte[] bytes = baos.toByteArray();
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02X", b));
            }

            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}