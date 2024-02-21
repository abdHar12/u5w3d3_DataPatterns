package harouane.u5w3d3_DataPatterns.Composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Page page1=new Page();
        Page page2=new Page();
        Page page3=new Page();
        Page page4=new Page();
        Page page5=new Page();
        Sections section1=new Sections(page1, page2);
        Sections section2=new Sections(page3, page4, page5);
        Book book= new Book(Arrays.asList(section1, section2), Arrays.asList(new Author("qwer", "rty")), 12.99);
        book.print();
    }
}
