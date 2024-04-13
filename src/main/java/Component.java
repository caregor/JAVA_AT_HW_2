interface Component {
    String getName();
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    String getValue(String key);
    void setValue(String key, String value);
}
