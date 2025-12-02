package edu.io;

import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;

public class FileDirectory implements FileSystemNode {

    private final Path path;
    private final List<FileSystemNode> children = new ArrayList<>();

    public FileDirectory(Path path) {
        this.path = path;
    }

    public void addChild(FileSystemNode child) {
        children.add(child);
    }

    @Override
    public String getName() {
        return path.getFileName().toString();
    }

    @Override
    public void print(int indentLevel) {
        System.out.println("  ".repeat(indentLevel) + "[+] " + getName());
        for (FileSystemNode child : children) {
            child.print(indentLevel + 1);
        }
    }
}

