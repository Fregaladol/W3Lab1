public class Ordenador {

    /* Trabajas para una tienda de informática y te encargan crear una base de datos para los nuevos ordenadores que van llegando.

    Necesitas crear el objeto Ordenador, con sus atributos correspondientes: marca, modelo, memoria RAM, capacidad del disco duro, precio ... etc (cantidad y tipo de  atributos a tu gusto, pero poner al menos 3).

    Debes añadir el método constructor, los getters y setters y el toString(). Recuerda no hacer copiar y pegar, ni buscar ningún método de generación de código automático. Hay que pensar y practicar, al menos por hoy!

    Siéntete libre de modificar el toString a tu gusto.

    Una vez definida la clase del ordenador, crea al menos 3 instancias y prueba a imprimir los objetos en dos maneras:

    1. Todas sus características

    2. Imprime solo características sueltas como la marca y el precio del ordenador elegido.

    3. Probar a cambiar una propiedad y volver a mostrarla. */

    private String marca;
    private String modelo;
    private int memoriaRam;
    private int capacidadDisco;
    private double precio;
    private String material;
    private double screenSize;
    private int releaseYear;
    private boolean ssd;

    public Ordenador(String marca, String modelo, int memoriaRam, int capacidadDisco, 
                    double precio, String material, double screenSize, int releaseYear,
                    boolean ssd) {
        
        
                    this.marca = marca;
                    this.modelo = modelo;
                    this.memoriaRam = memoriaRam;
                    this.capacidadDisco = capacidadDisco;
                    this.precio = precio;
                    this.material = material;
                    this.screenSize = screenSize;
                    this.releaseYear = releaseYear;
                    this.ssd = ssd;
    }

    



    public String getMarca() {
        return marca;
    }





    public void setMarca(String marca) {
        this.marca = marca;
    }





    public String getModelo() {
        return modelo;
    }





    public void setModelo(String modelo) {
        this.modelo = modelo;
    }





    public int getMemoriaRam() {
        return memoriaRam;
    }





    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }





    public int getCapacidadDisco() {
        return capacidadDisco;
    }





    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }





    public double getPrecio() {
        return precio;
    }





    public void setPrecio(double precio) {
        this.precio = precio;
    }





    public String getMaterial() {
        return material;
    }





    public void setMaterial(String material) {
        this.material = material;
    }





    public double getScreenSize() {
        return screenSize;
    }





    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }





    public int getReleaseYear() {
        return releaseYear;
    }





    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }





    public boolean isSsd() {
        return ssd;
    }





    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }





    @Override
    public String toString() {
        return "Ordenador de la marca " + this.marca + ", con el modelo " + this.modelo + ", tiene de memoria Ram " + this.memoriaRam + ", una capacidad de disco "
                + this.capacidadDisco + " GB (" + (this.ssd ? "SSD":"HD") + ")" + " tiene un precio de " + this.precio + "euros, ya que el material de construcción es " + this.material + ", tiene una pantalla de " + this.screenSize
                + ", y salio al mercado en el año " + this.releaseYear +"." 
                ;
    }

    public void precioDescuento(int descuento){
        double discount = 1 - (descuento/100.0);
        double newPrice =  this.precio * discount;
        setPrecio(newPrice);
    }





   

   

    

}
