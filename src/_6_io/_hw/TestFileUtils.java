package _6_io._hw;

import java.io.File;

public class TestFileUtils {
    public static void main(String[] args) {
        FileUtils.randomWrite(new File("output.txt"),15);
        FileUtils.sort(new File("output.txt"));
    }
}
