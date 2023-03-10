package SOLIDPrinciples;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Dependency Inversion Principle (DIP)
// High-Level modules should not depend upon low-level ones; use abstractions
public class DIP {

    enum Relationship{
        PARENT, CHILD, SIBLING
    }

    static class Person{
        public String name;
        // dob

        public Person(String name) {
            this.name = name;
        }
        
    }

    interface RelationshipBrowser{
        List<Person> findAllChildrenOf(String name);
    }

    static class Relationships implements RelationshipBrowser{ // Low Level Module

        private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

        public List<Triplet<Person, Relationship, Person>> getRelations() {
            return relations;
        }

        public void addParentAndChild(Person parent, Person chid){
            relations.add(new Triplet<>(parent, Relationship.PARENT, child));
            relations.add(new Triplet<>(child, Relationship.CHILD, parent));
        }

        @Override
        public List<Person> findAllChildrenOf(String name){
            return relations.stream()
                .filter(x -> Objects.equals(x.getValue0().name, name)
                && x.getValue1() == Relationship.PARENT)
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
        }
  
    }

    static class Research{ // High Level Module

        /*public Research(Relationships relationships){

            List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
            relations.stream()
                .filter(x -> x.getValue0().name.equals("John")
                && x.getValue1() == Relationship.PARENT)
                .forEach(ch -> System.out.println(
                    "John has a child called " + ch.getValue2().name
                ));
        }*/ // USELESS

        public Research(RelationshipBrowser browser){

            List<Person> children = browser.findAllChildrenOf("John");
            for(Person child : children){
                System.out.println("John has a child called " + child.name);
            }
        }
    }

    static class Demo{
        public static void main(String[] args) {

            Person parent = new Person("John");
            Person child1 = new Person("Chris");
            Person child2 = new Person("Matt");

            Relationships relationships = new Relationships();
            relationships.addParentAndChild(parent, child1);
            relationships.addParentAndChild(parent, child2);

            new Research(relationships);
        }
    }
}
