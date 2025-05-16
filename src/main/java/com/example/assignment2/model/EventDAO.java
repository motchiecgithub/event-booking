package com.example.assignment2.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class EventDAO {
    public static List<Event> loadEvents(String filename){
        List<Event> events = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = reader.readLine()) != null){
                events.add(EventFactory.createFromLine(line));
            }
        } catch (IOException e){
            System.out.println("File read error: " + e.getMessage());
        }
        return events;
    }
}
