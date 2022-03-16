package exercices.exams.Examen2solucio;

public class Poligon {
    Punt[] matriuPunts;
    public Poligon(Punt[] matriuPunts){
        this.matriuPunts = matriuPunts;
    }

    public float calcularPerimetre(){
        float perimetre = 0;
        for (int i = 0 ; i < matriuPunts.length; i++){
            if (i == matriuPunts.length-1){
                perimetre =+ matriuPunts[i].calcularDistanciaEntrePunts(matriuPunts[i]);
                break;
            }
            perimetre =+ matriuPunts[i].calcularDistanciaEntrePunts(matriuPunts[i+1]);
        }
        return perimetre;
    }



}
