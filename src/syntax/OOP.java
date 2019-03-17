package syntax;

public class OOP {
    private String attribute;
    private OOPComposition composition;

    public OOP(String attribute) {
        this.attribute = attribute;
    }

    public OOP(String attribute, OOPComposition composition) {
        this.attribute = attribute;
        this.composition = composition;
    }

    public void setAttribute(String attribute) {
        String validAttribute = attribute.toLowerCase();
        if (validAttribute.equals("attribute")){
            this.attribute = attribute;
        } else {
            this.attribute = "unknown";
        }
    }

    public String getAttribute() {
        return this.attribute;
    }

    public void printAttribute() {
        System.out.println(this.attribute);
    }

    public OOPComposition getComposition() {
        return composition;
    }
}
