package com.epam.test25;

import java.io.*;
import java.util.*;

public class SystemConsoleUserInputService implements UserInputService {

    private final InputStream inputStream;

    public SystemConsoleUserInputService() {

        this.inputStream = System.in;
    }

    @Override
    public String readInput() {

        Scanner scanner = new Scanner(inputStream);
        return scanner.nextLine();
    }
}
