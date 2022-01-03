package entidad;

public class Muñeco {

    private String cabeza;

    private String brazos;

    private String piernas;

    private boolean vivo;


    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public String getBrazos() {
        return brazos;
    }

    public void setBrazos(String brazos) {
        this.brazos = brazos;
    }

    public String getPiernas() {
        return piernas;
    }

    public void setPiernas(String piernas) {
        this.piernas = piernas;
    }

    @Override
    public String toString() {
        return "Muñeco{" +
                "cabeza='" + cabeza + '\'' +
                ", brazos='" + brazos + '\'' +
                ", piernas='" + piernas + '\'' +
                '}';
    }
}
