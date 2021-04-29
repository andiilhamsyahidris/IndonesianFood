package com.example.indonesianfood;

import android.os.Parcel;
import android.os.Parcelable;

public class FoodSumatera implements Parcelable{
    private String name;
    private String desc;
    private int photo;

    public FoodSumatera() {

    }

    protected FoodSumatera(Parcel in) {
        name = in.readString();
        desc = in.readString();
        photo = in.readInt();
    }
    public static final Creator<FoodSumatera> CREATOR = new Creator<FoodSumatera>() {
        @Override
        public FoodSumatera createFromParcel(Parcel in) {
            return new FoodSumatera(in);
        }

        @Override
        public FoodSumatera[] newArray(int size) {
            return new FoodSumatera[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

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
