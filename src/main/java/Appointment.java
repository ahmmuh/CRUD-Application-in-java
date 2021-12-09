import java.time.LocalDateTime;

public class Appointment {
    private int id;
   private String appointmentName;
   private String doctorName;
    private String patientName;
    private Long personalNumber;
    private LocalDateTime localDate;



    public Appointment(int id, String appointmentName, String doctorName, String patientName,
                       Long personalNumber, LocalDateTime localDate) {
        this.id = id;
        this.appointmentName = appointmentName;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.personalNumber = personalNumber;
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppointmentName() {
        return appointmentName;
    }

    public void setAppointmentName(String appointmentName) {
        this.appointmentName = appointmentName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Long getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(Long personalNumber) {
        this.personalNumber = personalNumber;
    }

    public LocalDateTime getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDateTime localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", appointmentName='" + appointmentName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", patientName='" + patientName + '\'' +
                ", personalNumber=" + personalNumber +
                ", localDate=" + localDate +
                '}';
    }
}
