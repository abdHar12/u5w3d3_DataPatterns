package harouane.u5w3d3_DataPatterns.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sections implements SectionAndPages{
    private final List<SectionAndPages> sectionAndPages=new ArrayList<>();

    public Sections(SectionAndPages... sectionAndPages) {
        this.sectionAndPages.addAll(Arrays.asList(sectionAndPages));
    }

    @Override
    public int getNumberOfPages() {
        return this.sectionAndPages.stream().mapToInt(el->el.getNumberOfPages()).sum();
    }

}
