package Lab365MiniProjetoAreasVerdesJoinville.models;

public class Localizacao {
    private int id;
    private String latitude;
    private String longitude;
    private String localizacao;
    private String areaVerde;

    public Localizacao(String latitude, String longitude, String localizacao, String areaVerde) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.localizacao = latitude + longitude;
        this.areaVerde = areaVerde;
    }

    public Localizacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLocalizacao() {
        return latitude + longitude;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getAreaVerde() {
        return areaVerde;
    }

    public void setAreaVerde(String areaVerde) {
        this.areaVerde = areaVerde;
    }

    @Override
    public String toString() {
        return "Localizacao{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", areaVerde=" + areaVerde +
                '}';
    }
}