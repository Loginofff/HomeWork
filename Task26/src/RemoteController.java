public class RemoteController {
    private TV tv;

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    public void on(int channelNumber) {
        Channel channel = tv.getChannel(channelNumber);
        if (channel == null) {
            System.err.println("Канал не найден!");
            return;
        }

        Program program = channel.getRandomProgram();
        if (program == null) {
            System.err.println("Нет доступных программ на данном канале!");
            return;
        }

        System.out.println("Случайная передача на канале " + channelNumber + ": " + program.getName());
    }
}
