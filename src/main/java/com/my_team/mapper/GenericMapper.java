package com.my_team.mapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class  GenericMapper <T>{
    private final ObjectMapper mapper;

    public GenericMapper() {
        this.mapper = new ObjectMapper();
        this.mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }
    public ObjectMapper getMapper() {
        return mapper;
    }

    public abstract String fromObjectToJson(T Object) throws JsonProcessingException;
}
