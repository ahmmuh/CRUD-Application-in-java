import java.util.List;

public interface AppointmentRepo {
    public List<Appointment> getAllAppointment();
    public Appointment addApointment();
    public Appointment getAppointment(int id);
    public Appointment uppdateAppointment(int id);
    public Appointment deleteAppointment(int id);

}
