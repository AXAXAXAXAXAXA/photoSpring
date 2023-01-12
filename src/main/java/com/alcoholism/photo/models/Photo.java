package com.alcoholism.photo.models;

import javax.persistence.*;
import java.util.Base64;

@Entity
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long photo_id;

    private String photo_path;

    @Lob
    public byte[] image;



    public Long getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(Long photo_id) {
        this.photo_id = photo_id;
    }

    public String getPhoto_path() {
        return photo_path;
    }

    public void setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
    }

    public byte[] getImage(){
        var img = Base64.getEncoder().encodeToString(image);
        return Base64.getDecoder().decode(img);
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImg(){
        var img = Base64.getEncoder().encodeToString(image);
        return img;
    }
}
