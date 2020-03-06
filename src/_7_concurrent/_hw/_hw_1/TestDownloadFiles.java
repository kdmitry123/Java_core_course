package _7_concurrent._hw._hw_1;


public class TestDownloadFiles {
    public static void main(String[] args) {
        new Thread(new DownloadFiles("/home/qwe/MyJavaCourse/","newFile"));
    }
}
