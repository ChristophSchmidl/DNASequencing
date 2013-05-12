/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekfactor.dnasequencer.model.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * A FileReader class which works with a given absolute path. 
 * 
 * @author Christoph Schmidl
 */
public class FileReader {

    /**
     * 
     * Reads the content of a given file by providing the path
     * and return the content as a String
     * 
     * @param path Absolute path to the target file
     * @return String content of the given file
     * @throws IOException 
     */
    public static String readFile(String path) throws IOException {

        String result = "";

        try (FileInputStream stream = new FileInputStream(new File(path))) {
            FileChannel fc = stream.getChannel();
            MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
            /* Instead of using default, pass in a decoder. */
            result = Charset.defaultCharset().decode(bb).toString().trim().replace("\n", "").replace("\r", "").toLowerCase();
        }

        return result;
    }
}
