package com.Prep20.Preparation.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GeneralException extends RuntimeException{

    private final String message;
}
