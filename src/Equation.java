import java.util.HashMap;
import java.util.Map;

public enum Equation {
    ADD("add"),
    SUB("sub"),
    MUL("mul"),
    DIV("div");

    public final String label;

    private static final Map<String, Equation> EQUATION_STRING_MAP = new HashMap<>();

    static {
        for (Equation e : values()){
            EQUATION_STRING_MAP.put(e.label, e);
        }
    }

    public static Equation valueOfLabel(String label){
        return EQUATION_STRING_MAP.get(label);
    }

    private Equation(String label){
        this.label = label;
    }
}