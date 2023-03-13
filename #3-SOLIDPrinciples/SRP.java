package SOLIDPrinciples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

// Single Responsibility Principle (SRP)
// A class should have one reason to change
// Separation of concerns - different classes handling different, independent tasks/problems 
public class SRP {
    
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text){
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    public void save(String filename) throws FileNotFoundException{
        try(PrintStream out = new PrintStream(filename)){
            out.println(toString());
        }
    }

    public void load(String filename){}
    public void load(URL url){}
}

// Put one responsibility to a class, its more possible refactorize
class Persistence{
    public void saveToFile(SRP journal, String filename, boolean overwrite) throws FileNotFoundException{
        if(overwrite || new File(filename).exists()){
            try(PrintStream out = new PrintStream(filename)){
                out.println(toString());
            }
        }
    }
}

// Main Method
class Demo{
    public static void main(String[] args) throws Exception {
        SRP j = new SRP();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "c://temp//journal.txt";
        p.saveToFile(j, filename, true);

        Runtime.getRuntime().exec("notepad.exe" + filename);
    }
}
