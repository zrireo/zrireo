package com.cedzreo;

import org.mindrot.jbcrot.Bcrypt; //yung sa pom ata

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       String password = "I love java"

               String hashed = Bcrypt.hashpw(password, Bcrypt.gensalt());
                System.out.printf(hashed);

                String loginPassword = "I love java";
                if(Bcrypt.checkpw(loginPassword, hashed)){
                    System.out.printf("Authorized");
                } else {
                    System.out.printf("Mali");
                }
        }
    }
