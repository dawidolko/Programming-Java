package pl.jaknauczycsieprogramowania.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
