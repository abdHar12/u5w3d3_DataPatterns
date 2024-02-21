package harouane.u5w3d3_DataPatterns.adapter;

import java.time.LocalDate;

public class Adapter implements DataSource {
    private Info info;

    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome()+" "+info.getCognome();
    }

    @Override
    public int getEta() {
        return LocalDate.now().getYear() - info.getDataDiNascita().getYear();
    }
}
