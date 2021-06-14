package ru.kosenko;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static ru.kosenko.ReflectionTester.start;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        start(Testing.class);
    }


}
