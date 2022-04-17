package com.adepto.my_first_spring.doctor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import   com.adepto.my_first_spring.doctor.DocController;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/doctors")
public class DocController {

    private final DoctorService doctorService;

     public  DocController(DoctorService doctorService) {

         this.doctorService = doctorService;

     }

    @GetMapping
    public List<Doctor> getDoctors() {

         return doctorService.getDoctors();
    }
}
