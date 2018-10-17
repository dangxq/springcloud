@echo

taskkill -f -t -im peer1.exe
::重命名javaw.exe为指定名称
copy "%JAVA_HOME%\bin\javaw.exe" "%JAVA_HOME%\bin\peer1.exe"
::使用指定名称的javaw.exe执行jar文件
start "lock-server" "%JAVA_HOME%\bin\peer1.exe" -jar D:\mySpace\springcloud\eureka-server\target\eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1

ping -n 1 127.0.0.1>nul

taskkill -f -t -im peer2.exe
::重命名javaw.exe为指定名称
copy "%JAVA_HOME%\bin\javaw.exe" "%JAVA_HOME%\bin\peer2.exe"
::使用指定名称的javaw.exe执行jar文件
start "lock-server" "%JAVA_HOME%\bin\peer2.exe" -jar D:\mySpace\springcloud\eureka-server\target\eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

ping -n 1 127.0.0.1>nul

::taskkill -f -t -im config.exe
::重命名javaw.exe为指定名称
::copy "%JAVA_HOME%\bin\javaw.exe" "%JAVA_HOME%\bin\config.exe"
::使用指定名称的javaw.exe执行jar文件
::start "lock-server" "%JAVA_HOME%\bin\config.exe" -jar D:\mySpace\springcloud\config-center\config-server\target\config-server-0.0.1-SNAPSHOT.jar

::ping -n 1 127.0.0.1>nul

::exit