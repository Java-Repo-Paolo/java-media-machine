package org.lessons.java.media;

public abstract class Media {
    private String title;

    public Media(String title)  throws IllegalArgumentException {
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("title nulla or blank");
        }
            this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void execute();
}
