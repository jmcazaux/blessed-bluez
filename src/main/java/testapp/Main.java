package testapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Main {

        private static final String TAG = BluetoothHandler.class.getSimpleName();
        private static final Logger logger = LoggerFactory.getLogger(TAG);
    public static void main(String[] args) throws Exception {

        if (Arrays.asList(args).contains("--server")) {
            logger.debug("Blessed bluez test app: starting in server mode");
            throw new Exception("Not implemented yet");
        }

        logger.debug("Blessed bluez test app: starting in client mode");
        BluetoothHandler bluetoothHandler = new BluetoothHandler();
    }
}
