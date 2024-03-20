import java.time.Duration;

public class Dvd extends Article {
    private Duration duree;
    private String real;

    public Duration getDuree(){
        return this.duree;
    }

    public String getReal(){
        return this.real;
    }

    public void setDuree(Duration duree){
        this.duree = duree;
    }

    public void setReal(String real){
        this.real = real;
    }
}
