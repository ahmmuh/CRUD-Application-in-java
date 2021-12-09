import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeAppointment implements AppointmentRepo{

     List<Appointment> appointments  =  Arrays.asList();
     List<Appointment> copyList  = new ArrayList<Appointment>(appointments);
    @Override
    public List<Appointment> getAllAppointment() {
        List<Appointment> appointments  =  Arrays.asList();
        return copyList;
    }

    private String appointmentName;
    private String doctorName;
    private String patientName;
    private Long personalNumber;
    private LocalDateTime localDate;

    @Override
    public Appointment addApointment() {
        Appointment ahmed = new Appointment(2,"Läkarbesök","Lundberg",
                "Ahmed Mukhtar",1950102l,LocalDateTime.now());
        copyList.add(ahmed);
        return ahmed;
    }

    @Override
    public Appointment getAppointment(int id) {
       List<Appointment> user = copyList.stream().filter(appointment -> appointment.getId() == id).collect(Collectors.toList());
        System.out.println("You got " + user.get(id));
        return user.get(id);
    }

    @Override
    public Appointment uppdateAppointment(int id) {
    List<Appointment> updatePatient = copyList.stream().filter(patient -> patient.getId() !=id)
            .collect(Collectors.toList());
    return updatePatient.get(id);
    }

    @Override
    public Appointment deleteAppointment(int id) {
        copyList.stream().filter(appointment -> appointment.getId() !=id);
        return null;
    }
}
