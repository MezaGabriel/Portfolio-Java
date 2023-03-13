package SOLIDPrinciples;

// Interface Segregation Principle (ISP)
// Don't put too much into an interface; split into separate interfaces
public class ISP {
    
    class Document{

    }

    interface Machine{ // Bad use of interface
        
        void print(Document d);
        void fax(Document d);
        void scan(Document d);
    }

    interface Printer{
        void print(Document d);
    }
    interface Scanner{
        void scan(Document d);
    }

    // Be aware of YAGNI: You Ain't Going to Need it

    class JustAPrinter implements Printer{

        @Override
        public void print(Document d) {
            // TODO Auto-generated method stub
            
        }
        
    }

    class Photocopier implements Printer, Scanner{

        @Override
        public void print(Document d) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void scan(Document d) {
            // TODO Auto-generated method stub
            
        }
        
    }

    /*class MultiFunctionPrinter implements Machine{ // THIS IS VIOLATING THE PRINCIPLE

        @Override
        public void fax(Document d) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void print(Document d) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void scan(Document d) {
            // TODO Auto-generated method stub
            
        }
        
    }

    class OldFashionedPrinter implements Machine{

        @Override
        public void fax(Document d) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void print(Document d) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void scan(Document d) {
            // TODO Auto-generated method stub
            
        }
        
    }*/
}
