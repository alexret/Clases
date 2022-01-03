package entidad;

public class Cuerpo {

    private String brazo;
    private String pierna;
    private String mano;
    private String torso;
    private String dedo;

    public String getDedo() {
        return dedo;
    }

    public void setDedo(String dedo) {
        this.dedo = dedo;
    }

    public String getBrazo() {
        return brazo;
    }

    public void setBrazo(String brazo) {
        this.brazo = brazo;
    }

    public String getPierna() {
        return pierna;
    }

    public void setPierna(String pierna) {
        this.pierna = pierna;
    }

    public String getMano() {
        return mano;
    }

    public void setMano(String mano) {
        this.mano = mano;
    }

    public String getTorso() {
        return torso;
    }

    public void setTorso(String torso) {
        this.torso = torso;
    }

    @Override
    public String toString() {
        return "Cuerpo{" +
                "brazo='" + brazo + '\'' +
                ", pierna='" + pierna + '\'' +
                ", mano='" + mano + '\'' +
                ", torso='" + torso + '\'' +
                '}';
    }
}
