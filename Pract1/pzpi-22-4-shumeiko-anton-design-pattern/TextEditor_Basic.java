import java.util.ArrayList;

public class TextEditor_Basic {
    private String text = "";

    public void write(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }

    // Проблема: як реалізувати скасування змін?
    // Погане рішення: зберігати історію як масив рядків
    private ArrayList<String> history = new ArrayList<>();

    public void save() {
        history.add(text);
    }

    public void undo() {
        if (history.size() > 0) {
            text = history.remove(history.size() - 1);
        }
    }
}