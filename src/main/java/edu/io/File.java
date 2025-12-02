package edu.io;

import java.nio.file.Path;

public class File implements FileSystemNode {

    private final Path path;

    public File(Path path) {
        this.path = path;
    }

    @Override
    public String getName() {
        return path.getFileName().toString();
    }

    @Override
    public void print(int indentLevel) {
        System.out.println("  ".repeat(indentLevel) + "- " + getName());
    }
}
