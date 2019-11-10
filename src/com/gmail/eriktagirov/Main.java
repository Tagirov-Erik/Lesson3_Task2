package com.gmail.eriktagirov;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        TextContainer tc = new TextContainer();
        Class<?> cls = TextContainer.class;
        SaveTo ann = cls.getAnnotation(SaveTo.class);
        Method[] methods = cls.getMethods();

        String path = ann.path();

        for (Method method: methods) {
            if (method.isAnnotationPresent(Saver.class)){
                method.invoke(tc, path);
                break;
            }
        }
    }
}
