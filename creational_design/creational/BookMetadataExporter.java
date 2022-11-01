package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {
    public abstract BookMetadataFormatter make();
    public void export(PrintStream stream) {

        BookMetadataFormatter res = make();
        for (Book book : books) {
            res.append(book);
        }
        stream.println(res.getMetadataString());
    }
}