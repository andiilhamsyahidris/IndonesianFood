package com.example.indonesianfood;

import java.util.ArrayList;

public class FoodDataSumatera {
    private static String[] foodNames = { "Kacimuih",
            "Gajeboh",
            "Sate Padang",
            "Rendang",
            "Soto Padang"
    };
    private static int[] foodPhotos = {R.drawable.kacimuih,
            R.drawable.gajeboh,
            R.drawable.satepadang,
            R.drawable.rendang,
            R.drawable.sotopadang
    };
    private static String[] foodDesc = {
            "Kacimuih adalah jajanan tradisional Orang Minangkabau yang dibuat dari perpaduan Ketela pohon dan parutan Kelapa.\n" +
                    "Kacimuih disajikan dengan taburan Gula untuk menambah rasa. Gula yang dipakai bisa gula pasir maupun gula \n" +
                    "merah (Gula aren). Kacimuih memiliki tekstur yang lunak dengan rasa yang gurih. Rasa gurih berasal dari \n" +
                    "parutan kelapa yang telah ditaburi gula.",
            "Gajebo, atau Gajeboh atau Gulai Gajebo atau Sampade daging, adalah makanan khas Sumatra Barat. Makanan ini biasanya\n" +
                    "menggunakan bahan sandung lamur yang merupakan bagian daging sapi yang hampir semuanya terdiri dari lemak\n" +
                    "kenyal (yang berada di bagian punuk sapi).",
            "Sate Padang memakai bahan daging sapi, lidah, atau jerohan (jantung, usus, dan tetelan) dengan bumbu kuah kacang" +
                    "kental (mirip bubur) ditambah cabai yang banyak sehingga rasanya pedas.",
            "Rendang atau randang adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan\n" +
                    "dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali.",
            "Soto Padang menggunakan potongan daging sapi yang digoreng. Ciri khas lainnya adalah adanya perkedel dan kerupuk berwarna merah\n" +
                    "jambu sebagai pelengkap. Soto Padang memiliki cita rasa gurih yang berasal dari kaldu sapi. Selain itu, soto ini juga disajikan\n" +
                    "bersama dengan soun dan irisan tomat. Untuk menambah kelezatannya, Anda juga bisa menambahkan irisan jeruk nipis."
    };
    static ArrayList<FoodSumatera> getListData() {
        ArrayList<FoodSumatera> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            FoodSumatera food = new FoodSumatera();
            food.setName(foodNames[position]);
            food.setDesc(foodDesc[position]);
            food.setPhoto(foodPhotos[position]);
            list.add(food);
        }
        return list;
    };
};
