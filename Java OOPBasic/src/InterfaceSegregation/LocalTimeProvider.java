package InterfaceSegregation;

import java.time.LocalTime;

public class LocalTimeProvider implements TimeProvider{
    @Override
    public int getHour() {
       return LocalTime.now().getHour();
    }
}
