package syntax;

public class OOPinheritance extends OOP {
    private String subAttribute;

    public OOPinheritance(String attribute) {
        super(attribute);
    }

    public OOPinheritance(String attribute, String subAttribute) {
        super(attribute);
        this.subAttribute = subAttribute;
    }

    @Override
    public void printAttribute() {
        super.printAttribute();
        System.out.println("Sub attribute: " + this.subAttribute);
    }
}
