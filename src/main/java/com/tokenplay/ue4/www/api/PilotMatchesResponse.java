package com.tokenplay.ue4.www.api;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PilotMatchesResponse extends JSONResponse {
    @JsonProperty("aaData")
    private final Collection<MatchData> matches;
}
