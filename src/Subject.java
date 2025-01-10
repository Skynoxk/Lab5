package com.lab5.lab5;
/*
 * Subject class is a class that contains the information of a subject
 * @author viphou
 * @version 1.0
 * @modify 2025/01/10
 */
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter @Setter
@AllArgsConstructor 
@NoArgsConstructor
public class Subject {
    private String subjectname;
    private int numberOfCredit = 1;
    private int subjectCode;
}
