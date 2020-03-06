/**
 * Напишите программу, которая в несколько потоков скачивает файлы по заданному списку URL-адресов.
 * Скачать файл можно например так:
 * BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream())
 */

package _7_concurrent._hw._hw_1;

import java.io.*;
import java.net.URL;

public class DownloadFiles implements Runnable{

    private static final String PATH = "/home/qwe/11111/";
    private final String url;
    private final String fileName;

    public DownloadFiles(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }

    @Override
    public void run() {

        try (
                BufferedInputStream in = new BufferedInputStream(new URL(url + fileName).openStream());
                FileOutputStream out = new FileOutputStream(PATH + fileName)
            ) {

            final byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                out.write(data, 0, count);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}


