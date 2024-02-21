package harouane.u5w3d3_DataPatterns.Chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        CaricaGerarchica tenente=new Tenente();
        CaricaGerarchica capitano=new Capitano();
        CaricaGerarchica maggiore=new Maggiore();
        CaricaGerarchica colonello=new Colonello();
        CaricaGerarchica generale=new Generale();

        VerifyStipendio verifyStipendio1= new VerifyStipendio(2500, tenente);
        VerifyStipendio verifyStipendio2= new VerifyStipendio(2500, capitano);
        VerifyStipendio verifyStipendio3= new VerifyStipendio(2500, maggiore);
        VerifyStipendio verifyStipendio4= new VerifyStipendio(2500, colonello);
        VerifyStipendio verifyStipendio5= new VerifyStipendio(2500, generale);

        verifyStipendio1.setNextFilter(verifyStipendio2);
        verifyStipendio2.setNextFilter(verifyStipendio3);
        verifyStipendio3.setNextFilter(verifyStipendio4);
        verifyStipendio4.setNextFilter(verifyStipendio5);

        verifyStipendio1.check();
    }
}
