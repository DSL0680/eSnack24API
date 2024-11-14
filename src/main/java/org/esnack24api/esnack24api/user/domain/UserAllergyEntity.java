package org.esnack24api.esnack24api.user.domain;

import jakarta.persistence.*;
import lombok.*;
import org.esnack24api.esnack24api.allergy.domain.AllergyEntity;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "tbl_user_allergy")
public class UserAllergyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uano;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uno")
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ano")
    private AllergyEntity allergy;
}
