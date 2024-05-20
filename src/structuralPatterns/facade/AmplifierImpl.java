package structuralPatterns.facade;

class AmplifierImpl implements Amplifier {

    @Override
    public void on() {
        System.out.println("Amplifier is on");
    }

    @Override
    public void off() {
        System.out.println("Amplifier is off");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }

    @Override
    public void setSource(String source) {
        System.out.println("Setting source to " + source);
    }
}

class TunerImpl implements Tuner {

    @Override
    public void on() {
        System.out.println("Tuner is on");
    }

    @Override
    public void off() {
        System.out.println("Tuner is off");
    }

    @Override
    public void setFrequency(double frequency) {
        System.out.println("Setting frequency to " + frequency);
    }

    @Override
    public void setStation(String station) {
        System.out.println("Setting station to " + station);
    }
}

class CDPlayerImpl implements CDPlayer {

    @Override
    public void on() {
        System.out.println("CD player is on");
    }

    @Override
    public void off() {
        System.out.println("CD player is off");
    }

    @Override
    public void play(String cd) {
        System.out.println("Playing CD: " + cd);
    }

    @Override
    public void stop() {
        System.out.println("Stopping CD");
    }
}

class DVDPlayerImpl implements DVDPlayer {

    @Override
    public void on() {
        System.out.println("DVD player is on");
    }

    @Override
    public void off() {
        System.out.println("DVD player is off");
    }

    @Override
    public void play(String movie) {
        System.out.println("Playing DVD: " + movie);
    }

    @Override
    public void stop() {
        System.out.println("Stopping DVD");
    }
}

class ScreenImpl implements Screen {

    @Override
    public void up() {
        System.out.println("Raising screen");
    }

    @Override
    public void down() {
        System.out.println("Lowering screen");
    }

    @Override
    public void on() {
        System.out.println("Turning on screen");
    }

    @Override
    public void off() {
        System.out.println("Turning off screen");
    }
}

class ProjectorImpl implements Projector {

    @Override
    public void on() {
        System.out.println("Turning on projector");
    }

    @Override
    public void off() {
        System.out.println("Turning off projector");
    }

    @Override
    public void setBrightness(int brightness) {
        System.out.println("Setting brightness to " + brightness);
    }
}
