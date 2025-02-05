package com.narainox.social_media_application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdatePostDto {
    private Integer id;
    private String title;
    private String content;
    private int user;
}
