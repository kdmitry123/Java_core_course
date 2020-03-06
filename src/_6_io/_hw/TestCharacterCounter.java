package _6_io._hw;

import java.io.File;
import java.io.IOException;

public class TestCharacterCounter {
    public static void main(String[] args) throws IOException {

        new CharacterCounter().count(new File("inputFile"),new File("outputFile"));
    }
}
