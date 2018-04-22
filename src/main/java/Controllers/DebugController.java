package Controllers;

import com.jfoenix.controls.JFXTextArea;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class DebugController implements Initializable {
 
    private static String LOG_PATH = " log/history.txt";

    @FXML
    private JFXTextArea logger;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	//Platform.runLater(() -> setLogger());
    }

/*    private void appendTextArea(String str) {
        logger.appendText(str);
    }

    private void load_logs() throws IOException {
        if (!Files.exists(Paths.get(LOG_PATH))) {
            try {
                Files.createFile(Paths.get(LOG_PATH));

            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        StringBuilder builder = new StringBuilder(4000);

        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_PATH))) {
            String line;
            while ((line = reader.readLine()) != null && line.length() != 0) {
                line += System.lineSeparator();
                builder.append(line);
            }
            logger.setText(builder.toString());
        }
    }

    private void save_logs(String cha) throws IOException {
        if (!Files.exists(Paths.get(LOG_PATH))) {
            try {
                Files.createFile(Paths.get(LOG_PATH));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_PATH, true))) {
            if (cha.equals("\n")) {
                cha.replace("\n", "\r\n");
            }
            writer.write(cha);
        }
    }

    private void setLogger() {
        LOG_PATH = LOG_PATH.substring(1, LOG_PATH.length());

        try {
            load_logs();
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.setEditable(false);

        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
            	Platform.runLater(() -> {
	                appendTextArea(String.valueOf((char) b));
	                try {
						save_logs(String.valueOf((char) b));
					} catch (IOException e) {
						e.printStackTrace();
					}
	            });

            }
        }, true));

        System.setErr(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
            	Platform.runLater(() -> {
	                appendTextArea(String.valueOf((char) b));
	                try {
						save_logs(String.valueOf((char) b));
					} catch (IOException e) {
						e.printStackTrace();
					}
	            });
            }
        }, true));
    }*/
}