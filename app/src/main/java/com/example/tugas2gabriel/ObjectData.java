package com.example.tugas2gabriel;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectData {
    private static String[] title = new String[]{
            "Belajar Pemrograman Dengan C", "Belajar Pemrograman Dengan Java",
            "Belajar Pemrograman Dengan Phyton", "Belajar Pengembangan Machine Learning",
            "Belajar Pemrograman Dengan Kotlin"};

    private static int[] thumbnail = new int[]{
            R.drawable.gambar1, R.drawable.gambar2new, R.drawable.gambar3,
            R.drawable.gambar4, R.drawable.gambar5};

    public static Collection<? extends ObjectModel> getListData(){
        ObjectModel objectModel = null;
        ArrayList<ObjectModel> list = new ArrayList<>();
        for (int i=0; i < title.length; i++){
            objectModel = new ObjectModel();
            objectModel.setGambar_course(thumbnail[i]);
            objectModel.setNama_course(title[i]);
            list.add(objectModel);
        }
        return list;
    }
}
