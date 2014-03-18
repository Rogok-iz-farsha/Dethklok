/**
 * ConsoleDemo.java Created on Mar 12, 2014
 */
package ru.mipt.spring2014.class06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDemo {

    public static void main(String[] args) throws IOException {
        final BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        for (;;) {
            String line = stdIn.readLine();
            char c = 0;
            if (line.length() != 0) {
                c = line.toCharArray()[line.length() - 1];
            }

            if (c == '/') {
                do {
                    line = line.concat("\n");
                    String newLine = stdIn.readLine();
                    c = line.toCharArray()[newLine.length() - 1];
                    line = line.concat(newLine);
                } while (c == '/');
            }
            if ("exit".equalsIgnoreCase(line)) {
                break;
            } else {
                System.out.println(">>>> " + line);
            }

        }
    }
}
