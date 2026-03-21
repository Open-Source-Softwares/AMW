@echo off
    powershell -Command "(New-Object Net.WebClient).DownloadFile('https://dl.google.com/android/repository/commandlinetools-win-14742923_latest.zip', 'commandlinetools.zip')"
    powershell -Command "Get-ChildItem commandlinetools.zip | Expand-Archive"
    ./cmdline-tools/bin/sdkmanager.bat "platform-tools" "platforms;android-36" "build-tools;36.0.0" --sdk_root=./android-build-tools
pause
