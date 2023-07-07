//package model;
//
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Table
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class Player {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int player_id;
//
//    @Column(name = "PLAYER_NAME")
//    private int player_name;
//
//    @ManyToOne
//    @JoinColumn(name = "team_id", nullable = false)
//    private Team team;
//
//}
