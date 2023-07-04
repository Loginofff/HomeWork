import java.util.Random;

public class Channel {
    private int number;
    private Program[] programs;

    public Channel(int number, Program[] programs) {
        this.number = number;
        this.programs = programs;
    }

    public int getNumber() {
        return number;
    }

    public Program getRandomProgram() {
        if (programs.length == 0) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(programs.length);
        return programs[index];
    }


}