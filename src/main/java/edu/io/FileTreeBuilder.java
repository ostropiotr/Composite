package edu.io;

import java.io.IOException;
import java.nio.file.*;

public class FileTreeBuilder {

    public static FileDirectory buildTree(Path rootPath) throws IOException {
        FileDirectory root = new FileDirectory(rootPath);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(rootPath)) {
            for (Path p : stream) {
                if (Files.isDirectory(p)) {
                    root.addChild(buildTree(p));
                } else {
                    root.addChild(new File(p));
                }
            }
        }
        return root;
    }
}

