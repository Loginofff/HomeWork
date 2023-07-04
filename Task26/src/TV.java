public class TV {
    private Channel[] channels;

    public TV(Channel[] channels) {
        this.channels = channels;
    }

    public Channel getChannel(int channelNumber) {
        for (int i = 0; i < channels.length; i++) {
            if (channels[i].getNumber() == channelNumber) {
                return channels[i];
            }
        }
        return null;
    }

}


