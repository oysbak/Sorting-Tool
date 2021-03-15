class Movie {
    private String title;
    private String desc;
    private int year;

    // write two constructors here
    Movie(String title, String description, int year) {
        this.title = title;
        this.desc = description;
        this.year = year;
    }

    Movie(String title, int year) {
        this.title = title;
        this.desc = "empty";
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}
