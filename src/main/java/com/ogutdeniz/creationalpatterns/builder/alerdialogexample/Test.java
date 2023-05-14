package com.ogutdeniz.creationalpatterns.builder.alerdialogexample;

public class Test {
    public static void main(String[] args) {
        new AlertDialog.Builder()
                .setText("Kaydetmeden çıkmak istediğinize emin misiniz?")
                .setButton(ButtonType.YES_NO_CANCEL)
                .setIcon(IconType.QUESTION)
                .build()
                .show();
    }
}
