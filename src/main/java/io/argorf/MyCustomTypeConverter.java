package io.argorf;

import org.apache.camel.Converter;

@Converter
public class MyCustomTypeConverter {
    @Converter
    public MyCustomType convert(String input) {
        return new MyCustomType(input);
    }
}
