package com.Задания.Exeption;

// An exception for queue-empty errors.
public class QueueEmptyException extends Exception {

    public String toString() {
        return "\nQueue is empty.";
    }
}