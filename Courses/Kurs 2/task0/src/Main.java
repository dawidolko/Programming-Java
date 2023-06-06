/*#0 kurs CZYM JEST PROGRAMOWANIE OBIEKTOWE? https://www.youtube.com/watch?v=EhmBjOjW0z8*/
public class Main {
    public static void main(String[] args)
    {
        RemoteControl remoteControl = new RemoteControl("Black");

        remoteControl.volumeUp();
        remoteControl.volumeUp();
        remoteControl.volumeUp();

        remoteControl.nextChannel();
        remoteControl.nextChannel();

        System.out.println(remoteControl.getCurrentChannel());
        System.out.println(remoteControl.getCurrentVolume());
        System.out.println(remoteControl.getColor());

        remoteControl.setCurrentChannel(50);
        remoteControl.setCurrentVolume(30);

        System.out.println(remoteControl.getCurrentVolume());
        System.out.println(remoteControl.getCurrentChannel());
    }
}