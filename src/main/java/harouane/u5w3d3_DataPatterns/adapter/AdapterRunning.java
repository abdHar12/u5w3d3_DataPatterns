package harouane.u5w3d3_DataPatterns.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AdapterRunning implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Info info=new Info("Yooo", "Broo", LocalDate.parse("1998-10-12"));

        Adapter adapter=new Adapter(info);

        System.out.println("Nome completo: " + adapter.getNomeCompleto());
        System.out.println("Eta: " + adapter.getEta());
    }
}
