package OOP.Polymorphism.Word;

public class Cut implements TextTransform{
    private String lastCut;
    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        lastCut = text.substring(startIndex,endIndex);
        text.replace(startIndex,endIndex,"");
    }
}
