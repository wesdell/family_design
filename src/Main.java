public class Main {
  public static void main(String[] args) {
    Person jose = new Person("Jose");
    Person mariaJose = new Person("Maria Jose");
    Person nicky = new Person("Nicky");
    Person german = new Person("German");
    Person nayeli = new Person("Nayeli");
    Person ronny = new Person("Ronny");
    Person person = new Person();

    jose.setMarriage(mariaJose);
    jose.setChild(german, nayeli);
    german.setChild(ronny);

    person.setChild(jose, nicky);

    System.out.println(jose.getDescendant(Level.GRAND_CHILD));
  }
}