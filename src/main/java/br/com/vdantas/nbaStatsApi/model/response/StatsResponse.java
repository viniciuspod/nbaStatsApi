package br.com.vdantas.nbaStatsApi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class StatsResponse {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("ast")
    private Integer ast;

    @JsonProperty("blk")
    private Integer blk;

    @JsonProperty("dreb")
    private Integer dreb;

    @JsonProperty("fg3_pct")
    private Double fg3Pct;

    @JsonProperty("fg3a")
    private Integer fg3a;

    @JsonProperty("fg3m")
    private Integer fg3m;

    @JsonProperty("fg_pct")
    private Double fgPct;

    @JsonProperty("fga")
    private Integer fga;

    @JsonProperty("fgm")
    private Integer fgm;

    @JsonProperty("ft_pct")
    private Double ftPct;

    @JsonProperty("fta")
    private Integer fta;

    @JsonProperty("ftm")
    private Integer ftm;

    @JsonProperty("game")
    private GameStatsResponse game;

    @JsonProperty("min")
    private String min;

    @JsonProperty("oreb")
    private Integer oreb;

    @JsonProperty("pf")
    private Integer pf;

    @JsonProperty("player")
    private PlayerStatsResponse player;

    @JsonProperty("pts")
    private Integer pts;

    @JsonProperty("reb")
    private Integer reb;

    @JsonProperty("stl")
    private Integer stl;

    @JsonProperty("team")
    private TeamResponse team;

    @JsonProperty("turnover")
    private Integer turnover;
}
