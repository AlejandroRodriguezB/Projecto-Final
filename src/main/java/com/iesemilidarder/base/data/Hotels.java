package com.iesemilidarder.base.data;

public class Hotels extends Products{
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
