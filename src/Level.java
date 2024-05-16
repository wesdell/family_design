public enum Level {
  GRAND_CHILD(2);

  private final int descendant;

  Level(int descendant) {
    this.descendant = descendant;
  }

  public int getDescendant() {
    return this.descendant;
  }
}