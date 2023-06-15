package de.iav.jaxrs;

import jakarta.validation.constraints.*;

public record Car(
        @NotNull(message = "brand can not be null ! ")
                @NotBlank(message = "brand is empty !")
             //   @Min(value = 2, message = "brand should be at least 2 characters! ")
            //    @Max(value = 20, message = "brand can not exceed 20 characters! ")
         String brand,
         //@Pattern(regexp = "[a-zA-Z]+")
         String type,
         String color)
{
}