package com.moonminder.api.birthday.domain;

import com.moonminder.api.member.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity(name = "BIRTHDAY")
public class Birthday {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "BIRTHDAY_DATE", nullable = false)
    private LocalDate birthdayDate;

    @Column(name = "TYPE", nullable = false)
    private BirthdayType type;

    @Column(name = "PICTURE", nullable = false)
    private String picture;

    @Column(name = "ALARM", nullable = false)
    private boolean alarm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @Builder
    public Birthday(String name, String phoneNumber, LocalDate birthdayDate, BirthdayType type, String picture, boolean alarm) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthdayDate = birthdayDate;
        this.type = type;
        this.picture = picture;
        this.alarm = alarm;
    }
}
