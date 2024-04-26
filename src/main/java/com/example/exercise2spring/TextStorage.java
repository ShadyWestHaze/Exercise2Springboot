package com.example.exercise2spring;

import org.springframework.stereotype.Component;

@Component
public class TextStorage {
    private String savedTexts = "";

    public void saveText(String text) {
        savedTexts += text + "\n";
    }

    public String getSavedTexts() {
        return savedTexts;
    }
}
