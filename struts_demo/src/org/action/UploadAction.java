package org.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;

/**
 * project_name:java_demo
 * package_name:org.action
 * user: youzipi
 * date: 2015/3/28 15:59
 */
public class UploadAction extends ActionSupport{
    private File file;
    private String fileName;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }


    @Override
    public String execute() throws Exception {
        InputStream inputStream = new FileInputStream(getFile());
        System.out.println(fileName);
        OutputStream outputStream = new FileOutputStream("D:\\Desktop\\"+ fileName);
        byte buffer[] = new byte[1024];
        int count = 0;
        while ((count=inputStream.read())>0){
            outputStream.write(buffer,0,count);
        }
        outputStream.close();
        inputStream.close();
        return SUCCESS;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
