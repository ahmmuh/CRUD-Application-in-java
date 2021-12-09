import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class MakeAppointmentTest {

    List<Appointment> appointments = Arrays.asList();
    @ParameterizedTest
    @Test
    void getAllAppointment() {
       MakeAppointment makeAppointment = new MakeAppointment();
       assertArrayEquals(1,makeAppointment.getAllAppointment());
        
    }

    private void assertArrayEquals(int i, List<Appointment> allAppointment) {
    }

    @Test
    void addApointment() {
    MakeAppointment makeAppointment = new MakeAppointment();
        Appointment appointment = new Appointment(1,"Besök","Ahmed Mukhtar","Lisa",1999999l,LocalDateTime.now());
        assertArrayEquals(makeAppointment.addApointment());
        System.out.println(appointment);
    }

    private void assertArrayEquals(Appointment addApointment) {
    }

    @Test
    void getAppointment(int id) {
       appointments.stream()
                .filter(appointment1 -> appointment1.getId() == id);
       assertArrayEquals(appointments.get(1));
    }

    @Test
    void uppdateAppointment(int id) {
        List<Appointment> updatePatient = appointments.stream().filter(patient -> patient.getId() ==id)
                .collect(Collectors.toList());


        assertArrayEquals(appointments.get(id));
    }

    @Test
    void deleteAppointment() {
        MakeAppointment makeAppointment = new MakeAppointment();
        assertArrayEquals(makeAppointment.deleteAppointment(1));
    }
}