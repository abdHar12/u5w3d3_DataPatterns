package harouane.u5w3d3_DataPatterns.Chain;

import lombok.Setter;

@Setter
public abstract class Filter {
    private Filter nextFilter; // Il prossimo filtro nella catena (potrebbe anche essere null)

    public abstract void check(); // Questo metodo andrà implementato da ogni classe che estende questa

    public void next() {
        if (this.nextFilter != null) {
            this.nextFilter.check();
        } else {
            System.err.println("Siamo arrivati a fine catena");
        }
    }
}
