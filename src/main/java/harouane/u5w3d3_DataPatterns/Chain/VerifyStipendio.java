package harouane.u5w3d3_DataPatterns.Chain;

public class VerifyStipendio extends Filter {
    int stipendio;
    CaricaGerarchica carica;
    public VerifyStipendio(int stipendio, CaricaGerarchica carica) {
        this.stipendio = stipendio;
        this.carica=carica;
    }
    @Override
    public void check() {
        if(carica.getStipendio()>=this.stipendio)
            System.out.println("Il " + carica.nome+ " percepisce almeno " +this.stipendio);
        else System.err.println("Il " + carica.nome+ " percepisce meno di " +this.stipendio);
        this.next();
    }
}
