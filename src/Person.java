import java.util.ArrayList;
import java.util.List;

public class Person {
  private final String name;
  private Person partner;
  private final ArrayList<Person> children = new ArrayList<>();

  public Person(String name) {
    this.name = name;
  }

  public Person() {
    this.name = "Unknown";
  }

  public void setMarriage(Person partner) {
    if (this.partner == partner) {
      return;
    }
    this.partner = partner;
    this.partner.setMarriage(this);
  }

  public void setChild(Person... children) {
    if (this.children.containsAll(List.of(children))) {
      return;
    }
    this.children.addAll(List.of(children));
    if (this.partner != null) {
      this.partner.setChild(children);
    }
  }

  public String getDescendant(Level level) {
    return this.getDescendant(level, 1);
  }

  public String getDescendant(Level desiredLevel, int actualNivel) {
    if (this.children == null) {
      return "";
    }

    StringBuilder content = new StringBuilder();

    if (desiredLevel.getDescendant() != actualNivel) {
      for (Person child : this.children) {
        content.append(child.getDescendant(desiredLevel, actualNivel + 1));
      }
    } else {
      for (Person child : this.children) {
        content.append(child.name);
      }
    }
    return content.toString();
  }
}