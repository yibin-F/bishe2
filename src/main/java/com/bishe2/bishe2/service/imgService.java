package com.bishe2.bishe2.service;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

@Service
public class imgService {
    public boolean saveImg(String parentPath, String filename, MultipartFile img) {
        try {
            //加载父文件
            File dir = new File(parentPath);
            //文件不存在或者不是文件夹，保证文件夹存在
            if (!dir.exists()||!dir.isDirectory()){
                //级联创建
               dir.mkdirs();
//                System.out.println(dir.mkdirs());
            }
            File url = new File(parentPath+"/"+filename);
//            url.createNewFile();
            //
            InputStream inputStream = img.getInputStream();
            FileUtils.copyInputStreamToFile(inputStream,url);
            inputStream.close();

//            //打开输出流
//            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(url));
//            //建缓冲区
//            byte[] arry = new byte[1024];
//            int size = -1;
//            while ((size=inputStream.read(arry))!=-1){
//                outputStream.write(arry,0,size);
//            }
//            inputStream.close();
//            outputStream.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
