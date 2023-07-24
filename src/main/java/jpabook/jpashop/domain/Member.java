package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class   Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")  //mappedBy : 나는 Order 테이블의 member 필드에 의해 매핑된 읽기 전용 거울이야
    private List<Order> orders = new ArrayList<>();
}
