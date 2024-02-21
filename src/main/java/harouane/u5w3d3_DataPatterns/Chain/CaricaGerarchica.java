package harouane.u5w3d3_DataPatterns.Chain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CaricaGerarchica {
    int stipendio;

    String nome;

    public CaricaGerarchica(int stipendio, String nome) {
        this.stipendio = stipendio;
        this.nome=nome;
    }
}
