package com.example.tmha.exampleopengl.lesson8;

/**
 * Created by tmha on 9/12/2017.
 */

interface ErrorHandler {
    enum ErrorType {
        BUFFER_CREATION_ERROR
    }

    void handleError(ErrorType errorType, String cause);
}
