package com.barabanov.demo.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientDto
{
    String firstname;
    String lastname;
    String phoneNum;
}
