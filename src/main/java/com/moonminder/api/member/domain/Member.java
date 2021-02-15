package com.moonminder.api.member.domain;

import com.moonminder.api.base.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity(name = "Member")
public class Member extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "PICTURE")
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE", nullable = false)
    private MemberType type;

    @Builder
    public Member(String name, String email, String password, String picture, MemberType type) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.picture = picture;
        this.type = type;
    }
}
