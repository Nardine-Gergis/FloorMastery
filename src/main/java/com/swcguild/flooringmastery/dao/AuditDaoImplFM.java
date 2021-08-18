package com.swcguild.flooringmastery.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;


public class AuditDaoImplFM implements AuditDaoFM{
    
    public static final String AUDIT_FILE = "data/audit.txt";

    @Override
    public void writeAuditEntry(String entry) {
        PrintWriter out = null;
        
        try {
            out = new PrintWriter(new FileWriter(AUDIT_FILE, true));
        } catch (IOException e) {
            System.out.println("Audit IO Exception");
        }
        
        LocalDateTime timestamp = LocalDateTime.now();
        out.println(timestamp.toString() + " : " + entry);
        out.flush();
    }
}
