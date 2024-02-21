package harouane.u5w3d3_DataPatterns.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Info {
    String nome;
    String cognome;
    private LocalDate dataDiNascita;
}
