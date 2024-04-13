import java.util.ArrayList;
import java.util.List;

public class ArrayComposite implements Composite{
    String name;
    private List<Component> children;

    public ArrayComposite(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public String getValue(String key) {
        StringBuilder combinedValue = new StringBuilder();
        for (Component child : children) {
            combinedValue.append(child.getValue(key)).append(" ");
        }
        return combinedValue.toString().trim();
    }

    @Override
    public void setValue(String key, String value) {
        for (Component child : children) {
            child.setValue(key, value);
        }
    }
}
