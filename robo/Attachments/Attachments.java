/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo.Attachments;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Attachments {
    
    private int fk_id;
    private String fk_table;
    private String title;
    private String description;
    private String file_name;
    private String file_path;
    private long file_size;
    private String file_type;
    private String date_added;
    private final int compression_type;
    

    public Attachments(String title, String file_name, File scrFile) {
        
        this.fk_table = "execution_tcsteps";
        this.title = title;
        this.file_name = file_name;
       
        //this.file_path = this.fk_table+"/"+fk_id+"/"+ scrFile.getName();
        this.file_path = "Selenium"+scrFile.getName();
        this.file_size = scrFile.length();
        this.file_type = "image/png";
        
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        String data = ft.format(dNow);
        
        
        this.date_added = data;
        this.compression_type = 1;
    }

    
    
   
    public int getFk_id() {
        return fk_id;
    }

    public void setFk_id(int fk_id) {
        this.fk_id = fk_id;
    }

    public String getFk_table() {
        return fk_table;
    }

    public void setFk_table(String fk_table) {
        this.fk_table = fk_table;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public long getFile_size() {
        return file_size;
    }

    public void setFile_size(int file_size) {
        this.file_size = file_size;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }
  
    
}
