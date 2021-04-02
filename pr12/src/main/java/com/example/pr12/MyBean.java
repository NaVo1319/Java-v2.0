package com.example.pr12;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class MyBean {
    String name1;
    String name2;
    public MyBean(){
        System.out.println("Start");
    }
    @PostConstruct
    private void init() throws IOException {
        Scanner scan=new Scanner(System.in);
        name1=scan.nextLine();
        name2=scan.nextLine();
        if(!name1.equals("")){
            BufferedReader file = new BufferedReader(new FileReader(new File(name1)));
            PrintWriter writer = new PrintWriter(name2, "UTF-8");
            ArrayList<String> lines=new ArrayList<>();
            String line;
            while((line = file.readLine()) != null){
                lines.add(line);
            }
            for(int i=0;i< lines.size();++i){
                writer.println(lines.get(i).hashCode());
            }
            writer.close();
            file.close();
        }
        else{
            PrintWriter writer = new PrintWriter(name2, "UTF-8");
            writer.println("null");
            writer.close();
        }
        System.out.println("Hash");
    }
    @PreDestroy
    private void close() {
        File fileDel=new File(name1);
        fileDel.delete();
        System.out.println("Delete");
    }
}
