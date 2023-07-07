//package model;
//
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class Team {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int team_id;
//
//    @Column(name = "TEAM_NAME")
//    private String team_name;
//
//    @OneToMany(mappedBy = "team")
//    private List<Player> players = new ArrayList<>();
//
//    @OneToMany(mappedBy = "team")
//    private List<Game> games_home = new ArrayList<>();
//
//    @OneToMany(mappedBy = "team")
//    private List<Game> games_away = new ArrayList<>();
//
//
//}
