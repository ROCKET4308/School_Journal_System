package com.rocket.marks;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MarksRequest {

    private String subjectName;
    private String studentMail;
    private LocalDate date;
    private Integer mark;
}
