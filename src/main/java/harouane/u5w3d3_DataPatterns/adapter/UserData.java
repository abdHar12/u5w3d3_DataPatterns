package harouane.u5w3d3_DataPatterns.adapter;


public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds){
        this.nomeCompleto=ds.getNomeCompleto();
        this.eta = ds.getEta();
    }
}
