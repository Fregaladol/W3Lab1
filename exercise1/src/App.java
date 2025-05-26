public class App {
    public static void main(String[] args) throws Exception {

        // Primera instancia
        
        Ordenador portatilLowEnd = new Ordenador("Asus", "Z13D", 8, 256, 500, "Plastic", 13, 2023, false);
        
        
        System.out.println(portatilLowEnd.toString());

        System.out.printf("Este ordenador tiene un precio de %.2f euros y es de la marca %s.\n",portatilLowEnd.getPrecio(), portatilLowEnd.getMarca());

        // Segunda instancia

        Ordenador portatilMediumEnd = new Ordenador("HP", "G9D", 16, 500, 800, "Plastic", 15, 2025, true);
        
        
        System.out.println(portatilLowEnd.toString());

        System.out.printf("Este ordenador tiene un precio de %.2f euros y es de la marca %s.\n",portatilMediumEnd.getPrecio(), portatilMediumEnd.getMarca());

        // Tercera instancia

         Ordenador portatilHighEnd = new Ordenador("Apple", "Macbook Pro M4", 32, 1000, 2100, "Aluminium", 14, 2025, true);
        
        
        System.out.println(portatilLowEnd.toString());

        System.out.printf("Este ordenador tiene un precio de %.2f euros y es de la marca %s.\n",portatilMediumEnd.getPrecio(), portatilMediumEnd.getMarca());

        portatilHighEnd.setMemoriaRam(64);
        System.out.printf("El ordenador ha cambiado en su memoria ram ahora tiene: %d GB.\n", portatilHighEnd.getMemoriaRam());

        portatilMediumEnd.precioDescuento(15);
        System.out.printf("El precio con un descuento del %d es de %.2f.",15,portatilMediumEnd.getPrecio());
    }
}
