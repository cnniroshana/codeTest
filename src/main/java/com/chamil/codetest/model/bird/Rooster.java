package com.chamil.codetest.model.bird;

public class Rooster extends Chicken {

    private Language language;

    public Rooster() {
        this.language = Language.ENGLISH;
    }

    public Rooster(Language languageParam) {
        this.language = languageParam;
    }

    @Override
    public void makeSound() {
        System.out.println(this.language.getSound());
    }


    public enum Language {

        ENGLISH("Cock-a-doodle-doo"),
        DANISH("kykyliky"),
        DUTCH("kukeleku"),
        FINNISH("kukko kiekuu"),
        FRENCH("cocorico"),
        GERMAN("kikeriki"),
        GREEK("kikiriki"),
        HEBREW("coo-koo-ri-koo"),
        HUNGARIAN("kukuriku"),
        ITALIAN("chicchirichi"),
        JAPANESE("ko-ke-kok-ko-o"),
        PORTUGUESE("cucurucu"),
        RUSSIAN("kukareku"),
        SWEDISH("kuckeliku"),
        TURKISH("kuk-kurri-kuuu"),
        URDU("kuklooku");


        private final String sound;

        Language(String soundParam) {
            this.sound = soundParam;
        }

        public String getSound() {
            return this.sound;
        };

    }
}
