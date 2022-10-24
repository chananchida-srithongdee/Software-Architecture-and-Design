import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookPublisher Naiin = new BookPublisher("Tyland", List.of("I", "moved", "here", "recently", "too"));
        Naiin.printToFile();
        BookReader Sompong = new BookReader("Tyland", List.of("I", "moved", "here", "recently", "too"));
        Sompong.printToScreen();
    }
}
