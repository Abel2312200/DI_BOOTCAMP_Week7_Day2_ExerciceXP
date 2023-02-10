public class XShape extends Shape{
    private String name;

    public XShape(String name) { // Default Constructor
        this.name = name;
    }

    // Overridden Method
    public String getName() {
        this.name += " "+super.getName();
        return this.name;
    }

    public void displayName(){
        System.out.println("{"+getName()+"}");
    }
}
