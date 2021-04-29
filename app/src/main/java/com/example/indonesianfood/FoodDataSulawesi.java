package com.example.indonesianfood;

import android.os.Parcel;

import java.util.ArrayList;
import java.util.Collection;

public class FoodDataSulawesi {
    public static String[] foodNames = {"Coto Makassar",
            "Kaledo",
            "Kapurung",
            "Pallu Basa",
            "Sayur Putungo"
    };
    public static int[] foodPhotos = {R.drawable.cotomakassar,
            R.drawable.kaledo,
            R.drawable.kapurung,
            R.drawable.pallubasa,
            R.drawable.sayurputungo
    };
    public static String[] foodDesc = {
            "Coto Makassar adalah makanan tradisional Makassar, Sulawesi Selatan. Makanan ini terbuat dari jeroan (isi perut) sapi yang \n" +
                    "direbus dalam waktu yang lama. Rebusan jeroan bercampur daging sapi ini kemudian diiris-iris lalu dibumbui dengan bumbu \n" +
                    "yang diracik secara khusus. Coto dihidangkan dalam mangkuk dan dinikmati dengan ketupat dan burasa atau yang biasa dikenal \n" +
                    "sebagai buras, yakni sejenis ketupat yang dibungkus daun pisang.",
            "Kaki Lembu Donggala atau yang lebih dikenal dengan nama Kaledo ini adalah makanan khas masyarakat Donggala \n" +
                    "yang terletak di provinsi Sulawesi Tengah, tepatnya di kota Palu. Makanan ini mirip dengan sup buntut, \n" +
                    "bedanya tulangnya dari kaki lembu dan disajikan bukan dengan nasi melainkan dengan ubi. Tulangnya itu sendiri \n" +
                    "adalah ruas tulang lutut yang masih penuh dengan sum-sum.",
            "Kappurung adalah salah satu makanan khas tradisional di Sulawesi Selatan yang terbuat dari sari atau tepung sagu. terbuat dari sari atau tepung sagu.",
            "Pallubasa adalah makanan tradisional Makassar, Sulawesi Selatan. Seperti Coto Mangkasara (Coto Makassar), Pallubasa juga terbuat dari jeroan (isi dalam perut) sapi atau kerbau. Proses memasaknya pun hampir sama dengan Coto Makassar, yaitu direbus dalam waktu lama. Setelah matang, jeroan yang ditambah dengan daging itu diiris-iris, kemudian ditaruh/dihidangkan dalam mangkuk.",
            "Sayur Putungo menjadi menu sederhana masyarakat Gorontalo dan menjadi ikon kuliner kota Gorontalo di mana terdapat cita rasa yang sangat pedas pada sayur ini. Sayur sederhana ini ternyata menjadi makanan utama di sana. Masyarakat setempat menyukai sayur yang pedas. Bila kurang suka dengan rasa pedas, Anda harus siap-siap menyediakan minum. Sebab tidak ada Sayur Putungo yang tidak pedas. \n" +
                    "Sayur Putungo bisa Anda temui di berbagai restoran yang tersebar di kota Gorontalo."
    };
    public static ArrayList<FoodSulawesi> getListData() {
        ArrayList<FoodSulawesi> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            FoodSulawesi food = new FoodSulawesi();
            food.setName(foodNames[position]);
            food.setDesc(foodDesc[position]);
            food.setPhoto(foodPhotos[position]);
            list.add(food);
        }
        return list;
    }
}
