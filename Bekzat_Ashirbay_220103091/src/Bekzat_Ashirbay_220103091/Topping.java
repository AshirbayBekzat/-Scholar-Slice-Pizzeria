package Bekzat_Ashirbay_220103091;


public class Topping {
    private String toppingTitle;
    private String spiceLevel;
    private String description;

    public Topping(String toppingTitle, String spiceLevel, String description) {
        this.toppingTitle = toppingTitle;
        this.spiceLevel = spiceLevel;
        this.description = description;
    }

    public String getToppingTitle() {
        return toppingTitle;
    }

    public void setToppingTitle(String toppingTitle) {
        this.toppingTitle = toppingTitle;
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "toppingTitle='" + toppingTitle + '\'' +
                ", spiceLevel='" + spiceLevel + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

