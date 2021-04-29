package com.example.indonesianfood;

import android.os.Parcel;
import android.os.Parcelable;

public class FoodJawa implements Parcelable {
    private String name;
    private String desc;
    private int photo;

    public FoodJawa() {

    }

    protected FoodJawa(Parcel in) {
        name = in.readString();
        desc = in.readString();
        photo = in.readInt();
    }
    public static final Creator<FoodJawa> CREATOR = new Creator<FoodJawa>() {
        @Override
        public FoodJawa createFromParcel(Parcel in) {
            return new FoodJawa(in);
        }

        @Override
        public FoodJawa[] newArray(int size) {
            return new FoodJawa[size];
        }
    };

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDesc() { return desc; }

    public void setDesc(String desc) { this.desc = desc; }

    public int getPhoto() { return photo; }

    public void setPhoto(int photo) { this.photo = photo; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeInt(photo);
    }
}
