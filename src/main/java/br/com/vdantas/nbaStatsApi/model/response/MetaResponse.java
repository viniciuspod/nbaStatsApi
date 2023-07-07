package br.com.vdantas.nbaStatsApi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MetaResponse {

	@JsonProperty("total_pages")
	private Integer totalPages;
	
	@JsonProperty("current_page")
	private Integer currentPage;
	
	@JsonProperty("next_page")
	private Integer nextPage;
	
	@JsonProperty("per_page")
	private Integer perPage;
	
	@JsonProperty("total_count")
	private Integer totalCount;
}
