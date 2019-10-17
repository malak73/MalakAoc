package y2019.aoc.malak.malakaoc2019;

import android.widget.Button;

public class Jobs {
    private String name;
    private String area;
    private Button click;
    private int imageId; //image mn el project
    private String image;


    public Jobs(String name, String area, Button click, int imageId, String image) {
        this.name = name;
        this.area = area;
        this.click = click;
        this.imageId = imageId;
        this.image = image;
    }

    public Jobs() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Button getClick() {
        return click;
    }

    public void setClick(Button click) {
        this.click = click;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}


