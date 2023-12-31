package de.iav.jaxrs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;

public class CarNotFoundExceptionMapper implements ExceptionMapper<CarNotFoundException> {

    private final ObjectMapper objectMapper=new ObjectMapper();
    @Override
    public Response toResponse(CarNotFoundException e){
        ErrorObject errorObject=new ErrorObject(e.getMessage());

        try {
            String json=objectMapper.writeValueAsString(errorObject);

            return  Response.status(Response.Status.NOT_FOUND)
                    .entity(json)
                    .type(MediaType.APPLICATION_JSON)
                    .build();

        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }

    private record ErrorObject(String error){}
}
