public class Main {
    public static void main(String[] args) {
        Leaf leaf = new ObjLeaf("leaf1");
        leaf.setValue("tag", "gg");
        String value = leaf.getValue("tag");
        System.out.println("Значение для ключа 'tag': " + value);

        Composite root = new ArrayComposite("root");

        Composite branch1 = new ArrayComposite("branch1");
        branch1.add(leaf);
        branch1.add(new ObjLeaf("leaf2"));

        Composite branch2 = new ArrayComposite("branch2");
        branch2.add(new ObjLeaf("leaf3"));
        branch2.getChild(0).setValue("TAG", "system");
        System.out.printf("Значение ключа в ветке %s: %s \n", branch2.getChild(0).getName(), branch2.getChild(0).getValue("TAG"));

        root.add(branch1);
        root.add(branch2);

        // Установка и получение значения по ключу
        root.setValue("key", "value");
        System.out.println("Значения ключей 'key': " + root.getValue("key"));
        System.out.println("Дочерний объект 'root': " + root.getChild(0).getName());
    }
}
