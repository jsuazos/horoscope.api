package com.api.horoscope.sign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Month;
import java.time.MonthDay;
import java.util.List;

@Configuration
public class SignConfig {

    @Bean
    CommandLineRunner commandLineRunner(SignRepository repository){
        return args -> {
            Sign aries = new Sign(
                    "Aries",
                    "",
                    MonthDay.of(Month.MARCH, 21),
                    MonthDay.of(Month.APRIL,19)
            );
            Sign tauro = new Sign(
                    "Tauro",
                    "",
                    MonthDay.of(Month.APRIL, 20),
                    MonthDay.of(Month.MAY, 20)
            );
            Sign geminis = new Sign(
                    "Géminis",
                    "",
                    MonthDay.of(Month.MAY, 21),
                    MonthDay.of(Month.JUNE,20)
            );
            Sign cancer = new Sign(
                    "Cáncer",
                    "",
                    MonthDay.of(Month.JUNE, 21),
                    MonthDay.of(Month.JULY,22)
            );
            Sign leo = new Sign(
                    "Leo",
                    "",
                    MonthDay.of(Month.JULY, 23),
                    MonthDay.of(Month.AUGUST,22)
            );
            Sign virgo = new Sign(
                    "Virgo",
                    "",
                    MonthDay.of(Month.AUGUST, 23),
                    MonthDay.of(Month.SEPTEMBER,22)
            );
            Sign libra = new Sign(
                    "Libra",
                    "",
                    MonthDay.of(Month.SEPTEMBER, 23),
                    MonthDay.of(Month.OCTOBER,22)
            );
            Sign escorpio = new Sign(
                    "Escorpio",
                    "",
                    MonthDay.of(Month.OCTOBER, 23),
                    MonthDay.of(Month.NOVEMBER,21)
            );
            Sign sagitario = new Sign(
                    "Sagitario",
                    "",
                    MonthDay.of(Month.NOVEMBER, 22),
                    MonthDay.of(Month.DECEMBER,21)
            );
            Sign capricornio = new Sign(
                    "Capricornio",
                    "",
                    MonthDay.of(Month.DECEMBER, 22),
                    MonthDay.of(Month.JANUARY,19)
            );
            Sign acuario = new Sign(
                    "Acuario",
                    "",
                    MonthDay.of(Month.JANUARY, 20),
                    MonthDay.of(Month.FEBRUARY,18)
            );
            Sign piscis = new Sign(
                    "Piscis",
                    "",
                    MonthDay.of(Month.FEBRUARY, 19),
                    MonthDay.of(Month.MARCH,20)
            );

            repository.saveAll(
                    List.of(aries, tauro, geminis, cancer, leo, virgo, libra, escorpio, sagitario, capricornio, acuario, piscis)
            );
        };
    }
}
