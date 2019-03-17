package syntax;

public class OOPComposition {
    private String compositionName;
    private int compositionSize;

    public OOPComposition(String compositionName, int compositionSize) {
        this.compositionName = compositionName;
        this.compositionSize = compositionSize;
    }

    public String getCompositionName() {
        return compositionName;
    }

    public int getCompositionSize() {
        return compositionSize;
    }

    public void start() {
        System.out.println("It's " + compositionName + " with size " + compositionSize);
    }
}
