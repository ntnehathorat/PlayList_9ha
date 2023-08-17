public class Song {
    private   String tittle;
    private double duration;

    //default constructor
    public Song()
    {

    }

    //para constructor
    public Song(String tittle, double duration) {
        this.tittle = tittle;
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "tittle='" + tittle + '\'' +
                ", duration=" + duration +
                '}';
    }
}
