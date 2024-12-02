package contactosWhatsapp;

public class ClaseApp {

	private int prefijo, numero;
	private String nombre, pais, apellidos;

	public ClaseApp(int prefijo, int numero, String nombre, String pais, String apellidos) {
		this.prefijo = prefijo;
		this.numero = numero;
		this.nombre = nombre;
		this.pais = pais;
		this.apellidos = apellidos;
	}

    public int getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
	

}
