/**
 *     2. Создать программно и заполнить файл случайными целыми числами.
 *        Отсортировать содержимое файла по возрастанию.
 */

package _6_io._hw;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class FileUtils {

    static void randomWrite(File file, int count) {
        Random random = new Random();
        try (OutputStream outputStream = new FileOutputStream(file, false)) {
            DataOutput out = new DataOutputStream(outputStream);
            for (int i = 0; i < count; i++) {
                out.writeInt(random.nextInt());
            }
            outputStream.flush();
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    static void sort(File file) {
        List<Integer> list = new ArrayList<>();
        try (InputStream inputStream = new FileInputStream(file)) {
            DataInput in = new DataInputStream(inputStream);

            long count = file.length() / 4;

            for (long i = 0; i < count; i++) {
                list.add(in.readInt());
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        list.sort(Comparator.naturalOrder());

        try (OutputStream outputStream = new FileOutputStream(file, false)) {
            DataOutput out = new DataOutputStream(outputStream);
            for (Integer number : list) {
                out.writeInt(number.intValue());
            }
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}
