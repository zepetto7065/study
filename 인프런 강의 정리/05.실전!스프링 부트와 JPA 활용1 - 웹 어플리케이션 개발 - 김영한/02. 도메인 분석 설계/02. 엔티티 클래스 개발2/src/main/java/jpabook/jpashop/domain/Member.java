package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address adress;

    @OneToMany(mappedBy = "member") //order table에 Member에 매핑되었다
    private List<Order> orders = new ArrayList<>();

}
