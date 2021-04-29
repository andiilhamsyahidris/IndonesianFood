package com.example.indonesianfood;

import android.os.Parcel;

import java.util.ArrayList;
import java.util.Collection;

public class FoodDataJawa {
    private static String[] foodNames = {"Gudeg",
            "Gethuk",
            "Nasi Liwet",
            "Rujak Cingur",
            "Mie Lethek"
    };
    private static int[] foodPhotos = {R.drawable.gudeg,
            R.drawable.gethuk,
            R.drawable.nasiliwet,
            R.drawable.rujakcingur,
            R.drawable.mielethek
    };
    private static String[] foodDesc = {
            "Gudeg adalah masakan tradisional Jawa dari Yogyakarta dan Jawa Tengah, Indonesia. Dalam perkembangannya, masyarakat mengenal gudeg terkenal berasal dari Yogyakarta sehingga membuat kota ini dikenal dengan nama Kota Gudeg. \n" +
                    "Gudeg terbuat dari nangka muda mentah (Jawa: gori). Direbus selama beberapa jam dengan gula aren, dan santan rempah-rempah tambahan termasuk bawang putih, bawang merah, kemiri, biji ketumbar, lengkuas, daun salam, \n" +
                    "dan daun jati, yang memberikan warna coklat kemerahan ke masakan.",
            "Getuk adalah  makanan ringan yang terbuat dengan bahan utama ketela pohon atau singkong. Getuk merupakan makanan yang mudah ditemukan di Jawa Tengah dan Jawa Timur. Pembuatan getuk diawali dengan singkong dikupas kemudian kukus \n" +
                    " atau perebusan, setelah matang kemudian ditumbuk atau dihaluskan dengan cara digiling lalu diberi pemanis gula dan pewarna makanan. Untuk penghidangan biasanya ditaburi dengan parutan buah kelapa.",
            "Nasi Liwet adalah  makanan khas kota Solo dan merupakan kuliner asli daerah Baki, Kabupaten Sukoharjo. \n" +
                    "Nasi liwet adalah nasi gurih (dimasak dengan kelapa) mirip nasi uduk, yang disajikan dengan sayur \n" +
                    "labu siam, suwiran ayam (daging ayam dipotong kecil-kecil) dan areh (semacam bubur gurih dari kelapa).",
            "Rujak cingur adalah salah satu makanan tradisional yang mudah ditemukan di daerah Jawa Timur, terutama daerah asalnya Surabaya. \n" +
                    "Dalam bahasa Jawa kata cingur berarti mulut, hal ini merujuk pada bahan irisan mulut atau moncong sapi yang direbus dan \n" +
                    "dicampurkan ke dalam hidangan. Rujak cingur biasanya terdiri dari irisan beberapa jenis buah seperti timun, kerahi (krai, yaitu \n" +
                    "sejenis timun khas Jawa Timur), bengkuang, mangga muda, nanas, kedondong, kemudian ditambah lontong, tahu, tempe, bendoyo, cingur, serta sayuran seperti kecambah/taoge, kangkung, dan kacang panjang.",
            "Mi letheg atau Mi Lethek, adalah salah satu kuliner mie yang berasal dari Srandakan, Bantul, Yogyakarta dengan menggunakan bahan dasar tepung tapioka dan singkong."
    };
    public static ArrayList<FoodJawa> getListData() {
        ArrayList<FoodJawa> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            FoodJawa food = new FoodJawa();
            food.setName(foodNames[position]);
            food.setDesc(foodDesc[position]);
            food.setPhoto(foodPhotos[position]);
            list.add(food);
        }
        return list;
    };
}
