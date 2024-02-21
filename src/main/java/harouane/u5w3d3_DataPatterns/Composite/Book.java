package harouane.u5w3d3_DataPatterns.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Book{
    List<SectionAndPages> sectionsAndPages;
    List<Author> authors;
    double price;

    public void print(){
        System.out.println(this.getNumberOfPages());
    }

    public int getNumberOfPages() {
        return this.sectionsAndPages.stream().mapToInt(el->el.getNumberOfPages()).sum();
    }
}
