#encoding issues with Netbeans IDE
#for Windows

- Go to C:\Program Files\NetBeans 8.2\etc
- Open netbeans.conf as Admin
- Go to line 46 and use # add the beggining
- Under line 46 write 
netbeans_default_options="-J-client -J-Xss2m -J-Xms32m -J-Dapple.laf.useScreenMenuBar=true -J-Dapple.awt.graphics.UseQuartz=true -J-Dsun.java2d.noddraw=true -J-Dsun.java2d.dpiaware=true -J-Dsun.zip.disableMemoryMapping=true -J-Dfile.encoding=UTF-8"

- Save & restart the IDE

-Now default encoding for Netbeans is UTF-8