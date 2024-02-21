package harouane.u5w3d3_DataPatterns.Composite;


public class Page implements SectionAndPages {
    final int pagesToAdd=1;
    @Override
    public int getNumberOfPages() {
        return pagesToAdd;
    }
}
