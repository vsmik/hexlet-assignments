package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// BEGIN
class App {
    public static void save(Path path, Car car) throws IOException {
        Files.writeString(path, car.serialize());
    }

    public static Car extract(Path path) throws IOException {
        return Car.deserialize(Files.readString(path));
    }
}
// END
