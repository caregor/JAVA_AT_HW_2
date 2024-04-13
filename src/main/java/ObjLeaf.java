import java.util.HashMap;

public class ObjLeaf implements Leaf{
    private HashMap<String, String> properties;
    private String name;

    public ObjLeaf(String name) {
        this.name = name;
        this.properties = new HashMap<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getValue(String key) {
        return properties.get(key);
    }

    @Override
    public void setValue(String key, String value) {
        properties.put(key, value);
    }
}
