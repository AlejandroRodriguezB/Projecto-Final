package com.iesemilidarder.base.data;

public class Hotel extends Product {
    private Integer rating;



    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getRoomsAviable() {
        return roomsAviable;
    }

    public void setRoomsAviable(String roomsAviable) {
        this.roomsAviable = roomsAviable;
    }

    private String roomsAviable;

}
