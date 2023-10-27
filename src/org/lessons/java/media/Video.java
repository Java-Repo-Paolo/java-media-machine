package org.lessons.java.media;

public class Video extends Audio implements HasBrightness {
    //COSTANTI
    public final static double MIN_BRIGHTNESS = 0.0;
    public final static double DEFAULT_BRIGHTNESS = 0.5;
    public final static double MAX_BRIGHTNESS = 0.9;


    //ATTRIBUTI
    private double brightness;


    //COSTRUTTORI
    public Video(String title) throws IllegalArgumentException {
        super(title);
        this.brightness = DEFAULT_BRIGHTNESS;
    }

    //METODI

    @Override
    public void darker() {
        if (brightness > MIN_BRIGHTNESS){
            brightness -= 0.1;
        }else {
            throw new RuntimeException("REACHED MIN BRIGHTNESS");
        }
    }

    @Override
    public void brighter() {
        if (brightness < MAX_BRIGHTNESS){
            brightness += 0.1;
        }else {
            throw new RuntimeException("REACHED MAX BRIGHTNESS");
        }
    }

    @Override
    public void printBrightness() {
        System.out.println("Current brightness: " + brightness);
    }

    @Override
    public void play() {
        String s = getTitle() + "*".repeat((int) brightness * 10);
        /*for (int i = 0; i < brightness * 10; i++) {
            s += "*";
        }*/
        System.out.println(s.repeat(getVolume()));
        /*for (int i = 0; i < getVolume(); i++) {
            System.out.print(s);
        }
        System.out.println();*/
    }


}
