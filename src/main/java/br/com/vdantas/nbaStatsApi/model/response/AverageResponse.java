package br.com.vdantas.nbaStatsApi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AverageResponse {

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("player_id")
    private Integer playerId;

    @JsonProperty("season")
    private Integer season;

    @JsonProperty("min")
    private String min;

    @JsonProperty("fgm")
    private Double fgm;

    @JsonProperty("fga")
    private Double fga;

    @JsonProperty("fg3m")
    private Double fg3m;

    @JsonProperty("fg3a")
    private Double fg3a;

    @JsonProperty("ftm")
    private Double ftm;

    @JsonProperty("fta")
    private Double fta;

    @JsonProperty("oreb")
    private Double oreb;

    @JsonProperty("dreb")
    private Double dreb;

    @JsonProperty("reb")
    private Double reb;

    @JsonProperty("ast")
    private Double ast;

    @JsonProperty("stl")
    private Double stl;

    @JsonProperty("blk")
    private Double blk;

    @JsonProperty("turnover")
    private Double turnover;

    @JsonProperty("pf")
    private Double pf;

    @JsonProperty("pts")
    private Double pts;

    @JsonProperty("fg_pct")
    private Double fgPct;

    @JsonProperty("fg3_pct")
    private Double fg3Pct;

    @JsonProperty("ft_pct")
    private Double ftPct;
}
