package harouane.u5w3d3_DataPatterns.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Author {
    private String name;
    private String surname;

    public String getFullName(){
        return name+" "+surname;
    }
}
