package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileDemo {

    public static void main(String[] args) {

        //zipFile==> compress file 

        String sourceFilePath="C:\\Users\\HP\\OneDrive\\Desktop\\sample11.txt";
        String zipFilePath="C:\\Users\\HP\\OneDrive\\Desktop\\sample12.zip";


		try{
			FileOutputStream fos=new FileOutputStream(zipFilePath);
			ZipOutputStream zos=new ZipOutputStream(fos);
			
			File fileToZip=new File(sourceFilePath);

			FileInputStream fis=new FileInputStream(fileToZip);

			ZipEntry zipentry=new ZipEntry(fileToZip.getName());

			zos.putNextEntry(zipentry);

			byte[] bytes=new byte[1024];

			int length;

			while((length= fis.read(bytes)) >= 0)
			{
				zos.write(bytes,0,length);
			}
			zos.close();
			fis.close();
			fos.close();

		}catch(Exception e)
		{
			System.out.println(e);
		}

	}
}







     
