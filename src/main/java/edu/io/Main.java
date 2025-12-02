package edu.io;

import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj katalog: ");

        Path rootPath = Path.of(sc.nextLine());

        FileDirectory root = FileTreeBuilder.buildTree(rootPath);

        System.out.println("\nStruktura katalogów:\n");
        root.print(0);
    }
}
