package com.adepto.my_first_spring.doctor;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class DoctorService {

    @GetMapping
    public List<Doctor> getDoctors() {
        return List.of(
                new Doctor(

                        1L, "Matthew", LocalDateTime.of(LocalDate.now(), LocalTime.now()), "ade@ymail.com", 21
                )

        );

    }
}
