APPVERSION=0.1

@echo off
    powershell -Command "(New-Object Net.WebClient).DownloadFile('https://dl.google.com/android/repository/commandlinetools-win-14742923_latest.zip', 'commandlinetools.zip')"
    powershell -Command "Get-ChildItem commandlinetools.zip | Expand-Archive"
    ./cmdline-tools/bin/sdkmanager.bat "platform-tools" "platforms;android-36" "build-tools;36.0.0" --sdk_root=./android-build-tools
    ./android-build-tools/build-tools/36.0.0/aapt2.exe compile --dir ./res -o ./builds/Marscoin_Android_Wallet-${APPVERSION}/res
    ./android-build-tools/build-tools/36.0.0/aapt2.exe link -I ./android-build-tools/platforms/android-36/android.jar --manifest ./Manifest.xml --min-sdk-version 16 --max-sdk-version 36 --target-sdk-version 36 --java ./builds/Marscoin_Android_Wallet-${APPVERSION}/res ./builds/Marscoin_Android_Wallet-${APPVERSION}/layout_layout.xml.flat ./builds/Marscoin_Android_Wallet/res/values_values.arsc.flat -o ./builds/Marscoin_Android_Wallet/MAW-Unsigned.apk
pause
