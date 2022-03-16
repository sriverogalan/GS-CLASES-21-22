package exercices.exams.Examen2solucio;

public class Punt {
    private float x;
    private float y;

    public Punt(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float calcularDistanciaEntrePunts(Punt punt){
        return (punt.getX()-getX()) + (punt.getY()-getY());
    }

    public void translladarOrigenCoordenades(Punt punt){
        punt.setX(punt.getX()-getX());
        punt.setY(punt.getY()-getY());
        setX(0);
        setY(0);
    }

}
